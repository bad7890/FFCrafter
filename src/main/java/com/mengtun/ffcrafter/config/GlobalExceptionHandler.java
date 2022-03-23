package com.mengtun.ffcrafter.config;


import static com.mengtun.ffcrafter.exception.FException.ex;

import cn.hutool.core.util.ArrayUtil;
import com.mengtun.ffcrafter.exception.AbstractException;
import com.mengtun.ffcrafter.exception.ErrorResponse;
import com.mengtun.ffcrafter.exception.ServiceException;
import com.mengtun.ffcrafter.constant.ResponseEnum;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;


@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

  private static final String END_LINE = "====================================TRACE END====================================";
  private static final String TRACE_FLAG = "com/mengtun";

  @Value("${cnf.test}")
  private boolean test;

  @ExceptionHandler(value = {RuntimeException.class, ServletException.class,
      MethodArgumentNotValidException.class, BindException.class})
  public ResponseEntity<Object> handleException(ServletWebRequest req, Exception e) {
    ServiceException exc;

    if (e instanceof ServiceException) {
      // service
      exc = (ServiceException) e;
    } else if (e instanceof AbstractException) {
      // project global custom exception
      exc = ex(ResponseEnum.INTERNAL_SERVER_ERROR);
    } else if (e instanceof NullPointerException) {
      // null pointer
      exc = ex(ResponseEnum.NULL_POINTER_EXCEPTION);
    } else if (e instanceof IllegalArgumentException) {
      // illegal argument
      exc = ex(ResponseEnum.ILLEGAL_ARGUMENT_EXCEPTION, e.getMessage());
    } else if (e instanceof ServletException) {
      // servlet
      exc = ex(ResponseEnum.BAD_REQUEST, e.getMessage());
    } else if (e instanceof DataAccessException) {
      // spring data access exception
      exc = ex(ResponseEnum.REPO_EXCEPTION);
    } else {
      // any others
      exc = ex(ResponseEnum.INTERNAL_SERVER_ERROR);
    }

    String msg = exc.getCMsg();
    // check and format params
    if (exc.getParams() != null) {
      msg = MessageFormat.format(msg, (Object[])exc.getParams());
    }
    exc.addFirst(msg);

    // get response from custom exception
    ErrorResponse res = exc.getResponse();

    // format exception traces with request data
    String[] traceMeta = expMeta(req, e);
    String[] traceData = parseTrace(e.getStackTrace());
    String[] trace = ArrayUtil.addAll(traceMeta, traceData);

    // log exceptions
    log.error(res.getMsg() + "\n" + String.join("\n", trace) + "\n" + END_LINE);

    // set traces
    if (test) {
      res.setTrace(trace);
    }
    return ResponseEntity.ok(res);
  }

//  @Override
//  protected ResponseEntity<Object> handleMissingServletRequestParameter(
//      MissingServletRequestParameterException ex,
//      HttpHeaders headers, HttpStatus status, WebRequest request) {
//    // from ResponseEntityExceptionHandler
//    return handleException((ServletWebRequest) request, ex);
//  }

  private String[] expMeta(ServletWebRequest req, Exception ex) {
    return new String[]{
        "HOST: " + req.getRequest().getRemoteHost(),
        "URI: " + req.getRequest().getRequestURI(),
        "METHOD: " + req.getHttpMethod(),
        "PARAMS: " + printParameterMap(req.getParameterMap()),
        "REQ: " + MDC.get("REQ"),
        "CAUSE: " + ex.toString() // include exception messages here
    };
  }

  private String printParameterMap(Map<String, String[]> map) {
    if (map.isEmpty()) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (Entry<String, String[]> e : map.entrySet()) {
      sb.append(e.getKey()).append('=');
      sb.append(Arrays.toString(e.getValue())).append('&');
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  /**
   * parse stack traces with most important infos
   */
  private String[] parseTrace(StackTraceElement[] stackTraces) {
    if (stackTraces[0].toString().contains(TRACE_FLAG)) {
      List<String> customTraces = new ArrayList<>();
      for (StackTraceElement element : stackTraces) {
        String trace = element.toString();
        if (trace.contains(TRACE_FLAG)) {
          customTraces.add(trace);
        } else {
          break;
        }
      }
      return customTraces.toArray(new String[customTraces.size()]);
    } else {
      return Arrays.stream(stackTraces).limit(13).map(Object::toString).toArray(String[]::new);
    }
  }

}

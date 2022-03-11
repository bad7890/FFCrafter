package com.mengtun.ffcrafter.exception;

import com.mengtun.ffcrafter.constant.ResponseEnum;
import lombok.Getter;

/**
 * service exception
 *
 */
@Getter
public class ServiceException extends AbstractException {

  /**
   * http status code
   */
  private int status;
  /**
   * resource bundle key
   */
  private String key;

  /**
   * resource msg
   */
  private String CMsg;
  /**
   * params bind to key
   */
  private String[] params;
  /**
   * custom error response
   */
  private ErrorResponse response;

  ServiceException(ResponseEnum response) {
    this.status = response.getStatus();
    this.key = response.name().toLowerCase();
    this.CMsg = response.getCMsg();
    this.response = new ErrorResponse(response.getCode());
  }

  ServiceException(ResponseEnum response, String message) {
    this(response);
    this.response.append(message);
  }

  /**
   * only specific exception need extra exception info
   *
   * @param ex extra exception
   */
  public ServiceException with(Exception ex) {
    super.setStackTrace(ex.getStackTrace());
    return with(ex.getMessage());
  }

  /**
   * with more subscription messages to show
   */
  public ServiceException with(String... messages) {
    response.append(messages);
    return this;
  }

  /**
   * fast way with single message
   */
  public ServiceException with(String message) {
    response.append(message);
    return this;
  }

  /**
   * bind extra params to current key
   *
   * @param params extra params
   * @return this
   */
  public ServiceException bind(String... params) {
    this.params = params;
    return this;
  }

  /**
   * add message to first position
   *
   * @param message top message
   * @return this
   */
  public ServiceException addFirst(String message) {
    response.insertFirst(message);
    return this;
  }

}

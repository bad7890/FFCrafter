package com.mengtun.ffcrafter.exception;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse implements Response {

  /**
   * custom code
   */
  private int code;
  /**
   * debug message for developers
   */
  private StringBuilder msg = new StringBuilder();
  /**
   * error trace for debug
   */
  private String[] trace;

  public ErrorResponse(int code) {
    this.code = code;
  }

  public ErrorResponse(int code, String msg) {
    this.code = code;
    if (StrUtil.isNotEmpty(msg)) {
      this.msg.append(msg);
    }
  }

  public void append(String message) {
    if (msg.length() != 0) {
      msg.append(msgDelim);
    }
    msg.append(message);
  }

  public void append(String... messages) {
    if (msg.length() != 0) {
      msg.append(msgDelim);
    }
    for (String message : messages) {
      msg.append(message).append(msgDelim);
    }
    msg.setLength(msg.length() - msgDelim.length());
  }

  public void insertFirst(String message) {
    if (msg.length() == 0) {
      msg.append(message);
    } else {
      msg.insert(0, message + msgDelim);
    }
  }

  /**
   * direct print this response to output stream, without traces
   */
  public String print() {
    return "{\"code\":" + code + ",\"msg\":\"" + msg + "\"}";
  }

}

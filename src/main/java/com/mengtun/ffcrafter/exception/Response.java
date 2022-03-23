package com.mengtun.ffcrafter.exception;


/**
 * global web response
 *
 */
public interface Response {

  /**
   * global response message delimiter
   */
  String msgDelim = AbstractException.MSG_DELIM;

  /**
   * response must have own code
   *
   * @return custom code, not http code
   */
  int getCode();
}

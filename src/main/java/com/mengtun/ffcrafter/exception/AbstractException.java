package com.mengtun.ffcrafter.exception;


public abstract class AbstractException extends RuntimeException {

  public static final String MSG_DELIM = " - ";
  private static final long serialVersionUID = -7575558874529522157L;

  public AbstractException() {
  }

  public AbstractException(String message) {
    super(message);
  }

  public AbstractException(Throwable cause) {
    super(cause);
  }

  public AbstractException(String message, Throwable cause) {
    super(message, cause);
  }

  public AbstractException(String... messages) {
    super(String.join(MSG_DELIM, messages));
  }

  public AbstractException(Throwable cause, String... messages) {
    super(String.join(MSG_DELIM, messages) + MSG_DELIM + cause.getMessage(), cause);
  }

}

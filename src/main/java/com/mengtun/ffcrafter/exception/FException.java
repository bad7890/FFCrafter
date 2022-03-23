package com.mengtun.ffcrafter.exception;


import com.mengtun.ffcrafter.constant.ResponseEnum;

/**
 * service module exception static tool
 */
public class FException extends ServiceException {

  private static final long serialVersionUID = 1L;

  private FException(ResponseEnum res) {
    super(res);
  }

  private FException(ResponseEnum res, String msg) {
    super(res, msg);
  }

  // client exceptions, others use of method to create
  public static FException badRequest(String msg) {
    return new FException(ResponseEnum.BAD_REQUEST, msg);
  }

  public static FException forbidden(String msg) {
    return new FException(ResponseEnum.FORBIDDEN, msg);
  }

  public static FException notFound(String msg) {
    return new FException(ResponseEnum.NOT_FOUND, msg);
  }

  public static FException conflict(String msg) {
    return new FException(ResponseEnum.CONFLICT, msg);
  }

  public static FException tooManyRequests(String msg) {
    return new FException(ResponseEnum.TOO_MANY_REQUESTS, msg);
  }

  public static FException dirtyData(String msg) {
    return new FException(ResponseEnum.REPO_EXCEPTION, msg);
  }

  /**
   * static exception
   *
   * @param res input message
   * @return FException
   */
  public static FException ex(ResponseEnum res) {
    return new FException(res);
  }

  /**
   * static exception
   *
   * @param res input message
   * @param msg addition message
   * @return FException
   */
  public static FException ex(ResponseEnum res, String msg) {
    return new FException(res, msg);
  }

}

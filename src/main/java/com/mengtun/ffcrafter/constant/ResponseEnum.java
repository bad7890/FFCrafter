package com.mengtun.ffcrafter.constant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.mengtun.ffcrafter.exception.Response;
import lombok.Getter;

/**
 * 返回枚举类，含无数据成功返回,异常返回，格式为 [http码, 自定义码]
 * <p>
 *   第一位状态码参考 {@link org.springframework.http.HttpStatus}
 *   第二位状态码为项目自定义，要求见代码块注释
 * <p>
 *   新增条目必须在资源包中声明，条目顺序与当前枚举相同，key为枚举名小写
 *
 */
@Getter
@JsonFormat(shape = Shape.OBJECT)
public enum ResponseEnum implements Response {

  /**
   * 成功返回，参考 http code = 200
   */
  SUCCESS(200, 200, "成功"),

  /**-----------------------------------------------------------------------
   *                客户端错误, 4xx, 必须参照 http code
   * 此类错误表示前端逻辑或请求处理有误，但凡前端无法知晓的视为业务异常，注意区分！
   * -----------------------------------------------------------------------
   */
  BAD_REQUEST(400, 400, "明显的客户端错误,传参错误"),
  UNAUTHORIZED(401, 401, "登录无效或已过期，请重新登录"),
  FORBIDDEN(403, 403, "无权操作"),
  NOT_FOUND(404, 404, "请求资源未找到"),
  CONFLICT(409, 409, "请求存在冲突（多端同时更新冲突）"),
  TOO_MANY_REQUESTS(429, 429, "给定的时间内发送了太多的请求"),

  /**
   * 服务器内部错误，http code = 500
   */
  INTERNAL_SERVER_ERROR(500, 500, "服务器内部错误"),

  /**-----------------------------------------------------------------------
   *    服务器错误, 5xx, 从 520 开始自定义, 主要按下层模块划分异常(并非业务)
   * -----------------------------------------------------------------------
   */
  NULL_POINTER_EXCEPTION(500, 520, "服务器空指针异常"),
  ILLEGAL_ARGUMENT_EXCEPTION(500, 521, "参数异常"),
  REPO_EXCEPTION(500, 522, "数据库模块异常"),
  MAIL_EXCEPTION(500, 523, "邮件服务异常"),
  UPLOAD_FAIL(500, 524, "文件上传失败"),

  /**-----------------------------------------------------------------------
   *     业务异常, xxxx, 4 位返回码, http码应视业务而定, 自定义码递增
   *     常见如: 400:传参错误, 403:无权操作, 404:资源不存在, 409:编辑更新冲突
   *     参数命名应可读且足够详细
   *     内容可含参数, 如: 用户{0}不存在
   * -----------------------------------------------------------------------
   */
  // === 通用[1] ===
  FILE_FORMAT_ERROR(400, 1002, "文件格式错误"),



  // 末尾分号
  ;

  /**
   * http码
   */
  private int status;
  /**
   * 返回自定义码
   */
  private int code;
  /**
   * 中文msg
   */
  private String cMsg;

  ResponseEnum(int status, int code, String cMsg) {
    this.status = status;
    this.code = code;
    this.cMsg = cMsg;
  }
}

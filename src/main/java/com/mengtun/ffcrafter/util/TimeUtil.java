package com.mengtun.ffcrafter.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import lombok.experimental.UtilityClass;

/**
 * java 8 jsr-310 time util
 *
 */
@UtilityClass
public final class TimeUtil {

  /**
   * simple date format should not contains zone info
   */
  public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE;

  /**
   * Server is always set as UTC, all datetime in project should be UTC, include databases.
   * While client may have many timezones, so controller should consume {@link ZonedDateTime}
   * and produces {@link LocalDateTime} with actual UTC, we use ISO 8601 format for respect.
   */
  public static final DateTimeFormatter DATETIME_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

  public static final DateTimeFormatter DATETIME_WITHOUT_SECOND = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
  public static final DateTimeFormatter DATETIME_WITHOUT_SECOND_B = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

  public static final DateTimeFormatter DATETIME_WITHOUT_TIME= DateTimeFormatter.ofPattern("yyyy-MM-dd");
  public static final DateTimeFormatter DATETIME_WITHOUT_TIME_B= DateTimeFormatter.ofPattern("yyyy/MM/dd");

  public static final DateTimeFormatter DATETIME_WITH_CHINESE= DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分");

  public static final DateTimeFormatter DATE_WITH_CHINESE= DateTimeFormatter.ofPattern("yyyy年MM月dd日");

  public static final DateTimeFormatter MONTHDAY_WITH_CHINESE= DateTimeFormatter.ofPattern("MM月dd日");

  public static final DateTimeFormatter DATETIME_WITH_CHINESE_DATE= DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");

  public static final DateTimeFormatter DATETIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  /**
   * convert {@link ZonedDateTime} to {@link LocalDateTime} in UTC
   *
   * @param zonedDateTime input zoned datetime
   * @return local datetime in UTC
   */
  public static LocalDateTime zone2Local(ZonedDateTime zonedDateTime) {
    return zonedDateTime.withZoneSameInstant(ZoneOffset.UTC).toLocalDateTime();
  }

  /**
   * convert old java date to local datetime
   *
   * @param date old java date
   * @return local datetime
   */
  public static LocalDateTime date2Local(Date date) {
    return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
  }

  /**
   * convert local datetime to old java date
   *
   * @param dateTime local datetime
   * @return date
   */
  public static Date local2Date(LocalDateTime dateTime) {
    return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
  }

  /**
   * convert local date to mid night time
   *
   * @param date local date
   * @return
   */
  public static LocalDateTime date2Time(LocalDate date) {
    return LocalDateTime.of(date, LocalTime.MIDNIGHT);
  }

  /**
   * convert local date to mid night time with timezone, assume UTC is default zone
   * @param date
   * @param offset
   * @return
   */
  public static LocalDateTime date2Time(LocalDate date, ZoneOffset offset) {
    return LocalDateTime.ofInstant(date2Time(date).toInstant(offset), ZoneOffset.UTC);
  }

}

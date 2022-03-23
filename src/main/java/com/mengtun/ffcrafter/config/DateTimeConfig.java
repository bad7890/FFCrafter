package com.mengtun.ffcrafter.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mengtun.ffcrafter.util.JsonUtil;
import com.mengtun.ffcrafter.util.TimeUtil;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.format.Formatter;

/**
 * spring boot global datetime config
 *
 */
@Configuration
public class DateTimeConfig {

  /**
   * global json mapper
   *
   * @return jackson mapper
   */
  @Bean
  @Primary
  public ObjectMapper serializingObjectMapper() {
    return JsonUtil.MAPPER;
  }

  /**
   * @deprecated never use date as request param, which would lost timezone
   *
   * spring mvc local date formatter
   *
   * @return localdate formatter
   */
  @Bean
  @Deprecated
  public Formatter<LocalDate> localDateFormatter() {
    return new Formatter<LocalDate>() {
      @Override
      public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text, TimeUtil.DATE_FORMAT);
      }

      @Override
      public String print(LocalDate object, Locale locale) {
        return TimeUtil.DATE_FORMAT.format(object);
      }
    };
  }

  /**
   * @deprecated use zoned datetime instead
   *
   * spring mvc local datetime formatter
   *
   * @return local datetime formatter
   */
  @Bean
  public Formatter<LocalDateTime> localDateTimeFormatter() {
    return new Formatter<LocalDateTime>() {
      @Override
      public LocalDateTime parse(String text, Locale locale) throws ParseException {
        return LocalDateTime.parse(text, TimeUtil.DATETIME_FORMAT);
      }

      @Override
      public String print(LocalDateTime object, Locale locale) {
        return TimeUtil.DATETIME_FORMAT.format(object);
      }
    };
  }
}
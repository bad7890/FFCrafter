package com.mengtun.ffcrafter.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.mengtun.ffcrafter.config.MillisOrLocalDateTimeDeserializer;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JsonUtil {
  public static ObjectMapper MAPPER = new ObjectMapper();


  static {
    // ignore unknown properties when deserialize
    MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    MAPPER.configure(SerializationFeature.WRITE_ENUMS_USING_INDEX, false);

    // ignore null

    //todo: 日期转换有BUG
    JavaTimeModule module = new JavaTimeModule();
    module.addSerializer(LocalDate.class, new LocalDateSerializer(TimeUtil.DATE_FORMAT));
    module.addDeserializer(LocalDate.class, new LocalDateDeserializer(TimeUtil.DATE_FORMAT));
    module.addSerializer(LocalDateTime.class,
        new LocalDateTimeSerializer(TimeUtil.DATETIME_FORMAT));
    module.addDeserializer(LocalDateTime.class,
        new MillisOrLocalDateTimeDeserializer());
    MAPPER.registerModule(module);

    // only deal with fields
    MAPPER.setVisibility(MAPPER.getSerializationConfig().getDefaultVisibilityChecker()
        .withFieldVisibility(Visibility.ANY).withGetterVisibility(Visibility.NONE)
        .withSetterVisibility(Visibility.NONE).withCreatorVisibility(Visibility.NONE)
        .withIsGetterVisibility(Visibility.NONE));

    // ignore null properties when serialize
    MAPPER.setSerializationInclusion(Include.NON_NULL);
  }

}

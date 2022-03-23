package com.mengtun.ffcrafter.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.mengtun.ffcrafter.util.TimeUtil;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class MillisOrLocalDateTimeDeserializer extends LocalDateTimeDeserializer {

  public MillisOrLocalDateTimeDeserializer() {
    super(TimeUtil.DATETIME_FORMAT);
  }

  @Override
  public LocalDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
    if (parser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
      long value = parser.getValueAsLong();

      return LocalDateTime.ofInstant(Instant.ofEpochMilli(value), ZoneId.systemDefault());
    }

    return super.deserialize(parser, context);
  }

}

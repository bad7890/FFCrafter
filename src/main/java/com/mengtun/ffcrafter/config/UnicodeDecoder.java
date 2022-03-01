package com.mengtun.ffcrafter.config;

import cn.hutool.core.text.UnicodeUtil;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

public class UnicodeDecoder implements Decoder {

  @Override
  public String decode(Response response, Type type)
      throws IOException, DecodeException, FeignException {
    if (response.body() == null) {
      throw new DecodeException(response.status(), "feign body is null", response.request());
    }

    //中文wiki返回unicode, 转码后返回
    return UnicodeUtil.toString(Util.toString(response.body().asReader(StandardCharsets.UTF_8)));
  }
}

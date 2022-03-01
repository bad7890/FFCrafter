package com.mengtun.ffcrafter.config;

import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;

public class UnicodeDecoderConfiguration{


  @Bean
  public Decoder feignDecoder() {

    return new UnicodeDecoder();
  }

}
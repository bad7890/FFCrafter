package com.mengtun.ffcrafter.service;

import com.mengtun.ffcrafter.dao.mapper.FFItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TestService {

  @Autowired
  private FFItemMapper ffItemMapper;


  public String getById(@RequestParam Integer id) {
    return ffItemMapper.getNameById(id);
  }
}

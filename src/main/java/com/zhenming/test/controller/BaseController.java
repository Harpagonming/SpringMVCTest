package com.zhenming.test.controller;

import com.zhenming.test.aspect.annotation.Log;
import com.zhenming.test.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/base")
public class BaseController {
  @Autowired
  private BaseService baseService;

  @Log
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  public Object baseInsert() {
    return baseService.insert();
  }

  @Log
  @RequestMapping(value = "/update", method = RequestMethod.GET)
  @ResponseBody
  public Object baseUpdate() {
    return baseService.update();
  }


}
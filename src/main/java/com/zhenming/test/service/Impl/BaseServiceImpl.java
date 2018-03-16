package com.zhenming.test.service.Impl;

import com.zhenming.test.dao.NameMapper;
import com.zhenming.test.entity.Name;
import com.zhenming.test.entity.NameExample;
import com.zhenming.test.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService{
  @Autowired
  private NameMapper nameMapper;

  public int insert() {
    Name name = new Name();
    name.setName("测试1");
    return nameMapper.insertSelective(name);
  }

  public int update() {
    NameExample nameExample = new NameExample();
    nameExample.createCriteria().andNameEqualTo("测试1");

    Name name = new Name();
    name.setName("测试3");
    return nameMapper.updateByExampleSelective(name, nameExample);
  }
}

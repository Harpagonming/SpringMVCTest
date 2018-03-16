package com.zhenming.test.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Property extends PropertyPlaceholderConfigurer {
  private static Map<String, Object> ctxPropertiesMap;

  public static String getProperty(String name) {
    if (null == ctxPropertiesMap) {
      return "";
    } else {
      Object o = ctxPropertiesMap.get(name);
      if (o == null) return "";
      else return o.toString();
    }
  }

  @Override
  protected void processProperties(ConfigurableListableBeanFactory beanFactory,
                                   Properties props) throws BeansException {

    super.processProperties(beanFactory, props);
    //load properties to ctxPropertiesMap
    ctxPropertiesMap = new HashMap<>();
    for (Object key : props.keySet()) {
      String keyStr = key.toString();
      String value = props.getProperty(keyStr);
      ctxPropertiesMap.put(keyStr, value);
    }
  }
}

package com.zhenming.test.utils;

import com.google.gson.Gson;

public class GsonEx {

  private Gson gson = null;

  private static GsonEx instance = null;

  private GsonEx() {
    gson = new Gson();
  }

  private static synchronized void init() {
    if (instance == null) {
      instance = new GsonEx();
    }
  }

  public static GsonEx getInstance() {
    if (instance == null) {
      init();
      return instance;
    } else {
      return instance;
    }
  }

  public String toJson(Object object){
    return gson.toJson(object);
  }
}

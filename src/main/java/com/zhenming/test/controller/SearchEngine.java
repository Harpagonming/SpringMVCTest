package com.zhenming.test.controller;

import com.zhenming.test.dao.FontMapper;
import com.zhenming.test.entity.Font;
import com.zhenming.test.entity.FontExample;
import com.zhenming.test.utils.ElasticSearch;
import com.zhenming.test.utils.GsonEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/elasticsearch")
public class SearchEngine {
  @Autowired
  private FontMapper fontMapper;

  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  @ResponseBody
  public Object insertIndex() {
    ElasticSearch es = ElasticSearch.getInstance();

    FontExample fontExample = new FontExample();
    fontExample.createCriteria().andIsDeletedEqualTo("0");
    List<Font> list = fontMapper.selectByExample(fontExample);

    for (Font font : list) {
      es.insert("font", "information", font.getId(), GsonEx.getInstance().toJson(font));
    }

    return null;
  }

  @RequestMapping(value = "/search", method = RequestMethod.GET)
  @ResponseBody
  public Object searchIndex(String str) {
    ElasticSearch es = ElasticSearch.getInstance();
    return es.search(str);
  }
}

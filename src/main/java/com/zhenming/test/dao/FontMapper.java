package com.zhenming.test.dao;

import com.zhenming.test.entity.Font;
import com.zhenming.test.entity.FontExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FontMapper {
    int countByExample(FontExample example);

    int deleteByExample(FontExample example);

    int deleteByPrimaryKey(String id);

    int insert(Font record);

    int insertSelective(Font record);

    List<Font> selectByExample(FontExample example);

    Font selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Font record, @Param("example") FontExample example);

    int updateByExample(@Param("record") Font record, @Param("example") FontExample example);

    int updateByPrimaryKeySelective(Font record);

    int updateByPrimaryKey(Font record);
}
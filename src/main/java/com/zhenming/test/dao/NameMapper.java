package com.zhenming.test.dao;

import com.zhenming.test.entity.Name;
import com.zhenming.test.entity.NameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NameMapper {
    int countByExample(NameExample example);

    int deleteByExample(NameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Name record);

    int insertSelective(Name record);

    List<Name> selectByExample(NameExample example);

    Name selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Name record, @Param("example") NameExample example);

    int updateByExample(@Param("record") Name record, @Param("example") NameExample example);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);
}
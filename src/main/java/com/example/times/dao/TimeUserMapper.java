package com.example.times.dao;

import com.example.times.model.TimeUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;


public interface TimeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TimeUser record);

    int insertSelective(TimeUser record);

    TimeUser selectByPrimaryKey(Integer id);

    TimeUser findByUserName(Map<String,String> params);

    int updateByPrimaryKeySelective(TimeUser record);

    int updateByPrimaryKey(TimeUser record);
}
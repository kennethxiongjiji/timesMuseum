package com.example.times.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//mapper注解


public interface TestMapper {

    //SQL注解
    @Select("SELECT 'hello' FROM dual")
    String findByState();

}

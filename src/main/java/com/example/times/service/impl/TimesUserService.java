package com.example.times.service.impl;


import com.example.times.common.ReturnCode;
import com.example.times.common.ReturnMsg;
import com.example.times.dao.TimeUserMapper;
import com.example.times.model.TimeUser;
import com.example.times.service.ITimesUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试mybatis
 */
@Service
public class TimesUserService implements ITimesUserService {
    @Autowired
    private TimeUserMapper timeUserMapper;
    @Override
    public ReturnMsg selectByName(String name) {
        int id = 1;
        TimeUser timeUser = timeUserMapper.selectByPrimaryKey(id);
        ReturnMsg returnMsg = new ReturnMsg();
        List<Object> list = new ArrayList<>();
        list.add(timeUser);
        returnMsg.setData(list);
        returnMsg.setCode(ReturnCode.SUCCESS);
        returnMsg.setSuccess(true);
        returnMsg.setMsg("查询成功！name:"+name);
        return returnMsg;
    }

    @Override
    public ReturnMsg deleteOne(String id) {
        return null;
    }

    @Override
    public ReturnMsg insertOne(TimeUser timeUser) {
        return null;
    }
}

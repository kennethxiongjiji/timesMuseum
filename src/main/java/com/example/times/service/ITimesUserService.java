package com.example.times.service;

import com.example.times.common.ReturnMsg;
import com.example.times.model.TimeUser;

public interface ITimesUserService
{
    ReturnMsg selectByName(String name);
    ReturnMsg deleteOne(String id);
    ReturnMsg insertOne(TimeUser timeUser);
}

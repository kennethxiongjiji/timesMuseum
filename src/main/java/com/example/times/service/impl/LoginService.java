package com.example.times.service.impl;

import com.example.times.dao.TimeUserMapper;
import com.example.times.model.TimeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rb on 2017/10/28.
 */
@Service
public class LoginService {
    @Autowired
    private TimeUserMapper timeUserMapper;

  public boolean verifyLogin(TimeUser user){
      Map<String,String> params = new HashMap<>();
      params.put("username",user.getUsername());
      params.put("password",user.getPassword());
     TimeUser timeUser = timeUserMapper.findByUserName(params);
     if(null != timeUser){
         return true;
     }
      return false;
  }

}

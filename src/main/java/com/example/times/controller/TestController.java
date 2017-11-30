package com.example.times.controller;


import com.example.times.common.ReturnCode;
import com.example.times.common.ReturnMsg;
import com.example.times.service.ITimesUserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

@Api(value = "/user", description = "user控制器")
@RestController
@RequestMapping("/user")
public class TestController {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private ITimesUserService timesUserService;
    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "userId", required = false, value = "用户Id",paramType = "query")
    )
    @ApiResponse(code = 200, message = "success", response = Result.class)
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ReturnMsg queryUserById(@RequestParam("userId") String userId, HttpServletRequest request) {
        ReturnMsg msg = new ReturnMsg();
        msg.setCode(ReturnCode.SUCCESS);
        msg.setMsg("test ok! ****" + userId);
        List<Object> numbers = new ArrayList<>();
        for(int i = 0; i<10 ; i++){
            numbers.add(i);
        }
        msg.setData(numbers);
        msg.setSuccess(true);
        return timesUserService.selectByName(userId);
    }
}

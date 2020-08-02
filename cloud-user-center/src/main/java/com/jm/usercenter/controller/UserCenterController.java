package com.jm.usercenter.controller;

import com.jm.usercenter.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserCenterController {

    @Autowired
    private OrderService orderService;

    /**
     * @description 获取当前用户的订单列表
     * @author jm
     * @date 2020
     * @param
     * @return
     */
    @GetMapping("userOrderList/{userId}")
    public Object getUserOrderList(@PathVariable String userId){
        Map<String,Object> resultMap = orderService.getUserOrderList(userId);
        resultMap.put("user", "testUser");
        resultMap.put("orderList", resultMap);
        return resultMap;
    }
}

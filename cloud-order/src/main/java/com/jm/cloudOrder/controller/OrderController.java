package com.jm.cloudOrder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("userOrderList/{userId}")
    public Object getUserOrderList(@PathVariable String userId) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("user", "John");
        resultMap.put("orderList", "testOrder");
        return resultMap;
    }
}

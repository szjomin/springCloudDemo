package com.jm.usercenter.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

/**
 * @author xiaomianyang
 * @description
 * @date 2019-07-19 11:32
 */
@FeignClient(name="cloud-order")
public interface OrderService {

    /**
     * @description 获取用户订单
     * @author jm
     * @date 2020
     * @param [userId]
     * @return
     */
    @GetMapping("userOrderList/{userId}")
    Map<String, Object> getUserOrderList(@PathVariable String userId);
}

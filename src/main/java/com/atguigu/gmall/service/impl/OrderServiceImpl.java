package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

import java.util.List;

/**
 * Created by bloom on 2018/9/2.
 */
public class OrderServiceImpl implements OrderService {
    UserService userService;


    public void initOrder(String userId) {
        //查询用户的收获地址
        List<UserAddress> addressesList = userService.getUserAddressList(userId);
        System.out.println(addressesList);
    }
}

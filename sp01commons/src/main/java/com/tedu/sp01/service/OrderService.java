package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * @author :mdzz
 * @description :
 * @date :2019/8/22 9:59
 */
public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}

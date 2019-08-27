package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * @author :mdzz
 * @description :
 * @date :2019/8/22 9:58
 */
public interface ItemService {
    /**
     *
     * @param orderId
     * @return
     */
    List<Item> getItems(String orderId);

    /**
     *
     * @param list
     */
    void decreaseNumbers(List<Item> list);
}

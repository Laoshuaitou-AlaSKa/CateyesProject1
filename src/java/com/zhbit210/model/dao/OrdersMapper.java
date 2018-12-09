package com.zhbit210.model.dao;

import com.zhbit210.model.pojo.Orders;
import com.zhbit210.model.pojo.Seat;

import java.util.List;

public interface OrdersMapper {
    Orders selectOrderById(int movieId,int userId);

    List<Orders> selectAllOrder();

    List<Orders> selectOrderByUserId(int userId);

    void deleteOrder(int orderId);

    List<Seat> selectSeats(int movieId);

    void createOrder(Orders orders);
}

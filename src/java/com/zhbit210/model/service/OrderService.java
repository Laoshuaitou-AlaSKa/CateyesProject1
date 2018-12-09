package com.zhbit210.model.service;

import com.zhbit210.model.pojo.Orders;
import com.zhbit210.model.pojo.Seat;

import java.util.List;

public interface OrderService {
    List<Seat> selectSeatsByMovieId(int movieId);

    List<Orders> selectMyOrders(int userId);

    int createOrder(Orders order);

    void deleteOrder(int orderId);
}

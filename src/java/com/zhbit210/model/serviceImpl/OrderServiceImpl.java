package com.zhbit210.model.serviceImpl;

import com.zhbit210.model.dao.MovieMapper;
import com.zhbit210.model.dao.OrdersMapper;
import com.zhbit210.model.dao.UserMessageMapper;
import com.zhbit210.model.pojo.Movie;
import com.zhbit210.model.pojo.Orders;
import com.zhbit210.model.pojo.Seat;
import com.zhbit210.model.pojo.UserMessage;
import com.zhbit210.model.service.OrderService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrdersMapper ordersMapper;
    private UserMessageMapper userMessageMapper;
    private MovieMapper movieMapper;
    private SqlSession sqlSession01;
    private SqlSession sqlSession02;
    private SqlSession sqlSession03;

    public OrderServiceImpl() throws IOException {
        this.sqlSession01 = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.sqlSession02 = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.sqlSession03 = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.ordersMapper = sqlSession01.getMapper(OrdersMapper.class);
        this.userMessageMapper = sqlSession02.getMapper(UserMessageMapper.class);
        this.movieMapper = sqlSession03.getMapper(MovieMapper.class);
    }

    @Override
    public List<Seat> selectSeatsByMovieId(int movieId) {
        List<Seat> seats = ordersMapper.selectSeats(movieId);
        for(int i = 0;i<seats.size();i++){
            System.out.println(seats.get(i).getRow() + "行 " + seats.get(i).getLine() + "列");
        }
        return seats;
    }

    @Override
    public List<Orders> selectMyOrders(int userId) {
        List<Orders> orders = ordersMapper.selectOrderByUserId(userId);
        for(int i = 0;i<orders.size();i++){
            System.out.println("订单" + (i+1) + ": " + orders.get(i));
        }
        return orders;
    }

    @Override
    public int createOrder(Orders order) {
        ordersMapper.createOrder(order);
        Orders newOrder = ordersMapper.selectOrderById((int)order.getMovieId(),(int)order.getUserId());
        System.out.println("新增订单：" + newOrder);
        System.out.println(ordersMapper.selectAllOrder());
        return (int)newOrder.getId();
    }

    @Override
    public void deleteOrder(int orderId) {
        ordersMapper.deleteOrder(orderId);
        System.out.println(ordersMapper.selectAllOrder());
    }
}

import com.zhbit210.model.pojo.Orders;
import com.zhbit210.model.service.OrderService;
import com.zhbit210.model.serviceImpl.OrderServiceImpl;

import java.io.IOException;

public class testOrderService {
    public static void main(String[] args) throws IOException {
        OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
        Orders order = new Orders(2,1,5,3,40,"已出票");
        orderServiceImpl.createOrder(order);
    }
}

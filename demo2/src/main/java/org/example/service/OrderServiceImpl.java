package org.example.service;

import org.example.Order;
import org.example.dao.OrderDao;

import java.util.List;

/**
 * 订单服务实现类
 */
public class OrderServiceImpl implements OrderService {
    
    private final OrderDao orderDao;
    
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    
    @Override
    public boolean createOrder(Order order) {
        System.out.println("创建订单: " + order.getOrderNumber());
        return orderDao.saveOrder(order);
    }
    
    @Override
    public Order getOrderById(Long id) {
        System.out.println("查询订单: " + id);
        return orderDao.findOrderById(id);
    }
    
    @Override
    public List<Order> getAllOrders() {
        System.out.println("查询所有订单");
        return orderDao.findAllOrders();
    }
    
    @Override
    public boolean payOrder(Long id) {
        System.out.println("支付订单: " + id);
        return orderDao.updateOrderStatus(id, "已支付");
    }
    
    @Override
    public boolean shipOrder(Long id) {
        System.out.println("发货订单: " + id);
        return orderDao.updateOrderStatus(id, "已发货");
    }
    
    @Override
    public boolean completeOrder(Long id) {
        System.out.println("完成订单: " + id);
        return orderDao.updateOrderStatus(id, "已完成");
    }
} 
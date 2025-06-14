package org.example.dao;

import org.example.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 订单数据访问实现类
 */
public class OrderDaoImpl implements OrderDao {
    // 模拟数据库存储
    private static final Map<Long, Order> orderMap = new HashMap<>();

    static {
        // 初始化一些测试数据
        orderMap.put(1L, new Order(1L, "ORD-001", 100.0, new Date(), "待支付"));
        orderMap.put(2L, new Order(2L, "ORD-002", 200.0, new Date(), "已支付"));
        orderMap.put(3L, new Order(3L, "ORD-003", 300.0, new Date(), "已发货"));
    }

    @Override
    public boolean saveOrder(Order order) {
        if (order == null || order.getId() == null) {
            return false;
        }
        orderMap.put(order.getId(), order);
        return true;
    }

    @Override
    public Order findOrderById(Long id) {
        return orderMap.get(id);
    }

    @Override
    public List<Order> findAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public boolean updateOrderStatus(Long id, String status) {
        Order order = orderMap.get(id);
        if (order != null) {
            order.setStatus(status);
            return true;
        }
        return false;
    }
} 
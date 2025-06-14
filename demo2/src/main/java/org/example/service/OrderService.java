package org.example.service;

import org.example.Order;

import java.util.List;

/**
 * 订单服务接口
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order 订单对象
     * @return 是否创建成功
     */
    boolean createOrder(Order order);

    /**
     * 查询订单
     * @param id 订单ID
     * @return 订单对象
     */
    Order getOrderById(Long id);

    /**
     * 获取所有订单
     * @return 订单列表
     */
    List<Order> getAllOrders();

    /**
     * 支付订单
     * @param id 订单ID
     * @return 是否支付成功
     */
    boolean payOrder(Long id);

    /**
     * 发货
     * @param id 订单ID
     * @return 是否发货成功
     */
    boolean shipOrder(Long id);

    /**
     * 完成订单
     * @param id 订单ID
     * @return 是否完成成功
     */
    boolean completeOrder(Long id);
} 
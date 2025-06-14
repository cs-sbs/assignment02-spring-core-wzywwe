package org.example.dao;

import org.example.Order;

import java.util.List;

/**
 * 订单数据访问接口
 */
public interface OrderDao {
    /**
     * 保存订单
     * @param order 订单对象
     * @return 是否保存成功
     */
    boolean saveOrder(Order order);

    /**
     * 根据ID查询订单
     * @param id 订单ID
     * @return 订单对象
     */
    Order findOrderById(Long id);

    /**
     * 查询所有订单
     * @return 订单列表
     */
    List<Order> findAllOrders();

    /**
     * 更新订单状态
     * @param id 订单ID
     * @param status 新状态
     * @return 是否更新成功
     */
    boolean updateOrderStatus(Long id, String status);
} 
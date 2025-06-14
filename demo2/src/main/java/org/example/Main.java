package org.example;

import org.example.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * 应用主类
 * 用于测试Spring IoC和AOP
 */
public class Main {
    public static void main(String[] args) {
        // 使用XML配置方式创建Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 从容器中获取OrderService Bean
        OrderService orderService = context.getBean(OrderService.class);

        System.out.println("\n===== 测试创建订单 =====");
        Order newOrder = new Order(4L, "ORD-004", 400.0, new Date(), "待支付");
        orderService.createOrder(newOrder);

        System.out.println("\n===== 测试查询单个订单 =====");
        Order order = orderService.getOrderById(1L);
        System.out.println("查询结果: " + order);

        System.out.println("\n===== 测试查询所有订单 =====");
        List<Order> orders = orderService.getAllOrders();
        System.out.println("订单数量: " + orders.size());
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\n===== 测试支付订单 =====");
        orderService.payOrder(4L);

        System.out.println("\n===== 测试发货 =====");
        orderService.shipOrder(4L);

        System.out.println("\n===== 测试完成订单 =====");
        orderService.completeOrder(4L);

        System.out.println("\n===== 查看订单状态变化 =====");
        Order updatedOrder = orderService.getOrderById(4L);
        System.out.println("更新后的订单: " + updatedOrder);

        // 关闭容器
        context.close();
    }
} 
package org.example;

import java.util.Date;

/**
 * 订单实体类
 */
public class Order {
    private Long id;
    private String orderNumber;
    private Double amount;
    private Date createTime;
    private String status;

    public Order() {
    }

    public Order(Long id, String orderNumber, Double amount, Date createTime, String status) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.amount = amount;
        this.createTime = createTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", amount=" + amount +
                ", createTime=" + createTime +
                ", status='" + status + '\'' +
                '}';
    }
} 
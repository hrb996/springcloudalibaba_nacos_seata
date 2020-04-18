package com.ex2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
public class TOrder implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "int2", type = IdType.AUTO)
    private Long int2;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 金额
     */
    private float money;

    /**
     * 订单状态:  0:创建中 1:已完结
     */
    private Integer status;


    public Long getInt2() {
        return int2;
    }

    public void setInt2(Long int2) {
        this.int2 = int2;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        "int=" + int2 +
        ", userId=" + userId +
        ", productId=" + productId +
        ", count=" + count +
        ", money=" + money +
        ", status=" + status +
        "}";
    }
}

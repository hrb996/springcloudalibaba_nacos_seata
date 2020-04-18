package com.ex2.service;

import com.ex2.entity.TOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
public interface TOrderService extends IService<TOrder> {
    /**
     * 创建订单
     * @param order
     */
    void create(TOrder order);
}

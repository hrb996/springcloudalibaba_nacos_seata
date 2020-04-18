package com.ex2.controller;


import com.ex2.cloudcommons.entity.CommonResult;
import com.ex2.entity.TOrder;
import com.ex2.service.TOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
@RestController
public class TOrderController {
    @Resource
    private TOrderService tOrderService;
   /* @Resource
    private IdGeneratorSnowflake idGeneratorSnowflake;*/

    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @GetMapping("order/create")

    public CommonResult create(TOrder order) {

        tOrderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}


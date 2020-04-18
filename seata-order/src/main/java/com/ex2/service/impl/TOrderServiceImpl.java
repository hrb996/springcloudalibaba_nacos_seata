package com.ex2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ex2.entity.TOrder;
import com.ex2.mapper.TOrderMapper;
import com.ex2.service.TAccountService;
import com.ex2.service.TOrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements TOrderService {
    @Resource
    private TOrderMapper tOrderMapper;
    @Resource
    private TAccountService tAccountService;
    @Override

    @GlobalTransactional(name="fsp-order",rollbackFor = Exception.class)
    public void create(TOrder order) {
        // 1 新建订单
        System.out.println("----->开始新建订单");
        tOrderMapper.create(order);
        // 2 扣减库存
       /* System.out.println("----->订单微服务开始调用库存,做扣减Count");
        System.out.println("============"+order.getProductId()+"\t"+order.getCount());

        // storageService.decrease(order.getProductId(), order.getCount());
        System.out.println("----->订单微服务开始调用库存,做扣减End");*/

        // 3 扣减账户
        System.out.println("----->订单微服务开始调用账户,做扣减Money");
       tAccountService.decrease(order.getUserId(),order.getMoney());

        System.out.println("----->订单微服务开始调用账户,做扣减End");

        // 4 修改订单状态,从0到1,1代表已完成
        System.out.println("----->修改订单状态开始");
       // orderDao.update(order.getUserId(), 0);
        tOrderMapper.update(order.getUserId(), 0);
        System.out.println("----->下订单结束了,O(∩_∩)O哈哈~");
    }
}

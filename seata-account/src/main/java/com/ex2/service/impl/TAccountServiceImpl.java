package com.ex2.service.impl;

import com.ex2.entity.TAccount;
import com.ex2.mapper.TAccountMapper;
import com.ex2.service.TAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 账户表 服务实现类
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
@Service
@Slf4j
public class TAccountServiceImpl extends ServiceImpl<TAccountMapper, TAccount> implements TAccountService {
@Resource
 private TAccountMapper tAccountMapper;
    @Override
    public void decrease(Long userId, float money) {
        log.info("*******->account-service中扣减账户余额开始");
        tAccountMapper.decrease(userId,money);
        log.info("*******->account-service中扣减账户余额结束");
    }
}

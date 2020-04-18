package com.ex2.service;

import com.ex2.entity.TAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 账户表 服务类
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
public interface TAccountService extends IService<TAccount> {
    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    void decrease(Long userId, float money);

}

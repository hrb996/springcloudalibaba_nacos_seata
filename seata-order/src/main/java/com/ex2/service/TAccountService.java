package com.ex2.service;

import com.ex2.cloudcommons.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 账户表 服务类
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */

@FeignClient(value = "seata-account-service")
public interface TAccountService {
    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    @PostMapping(value = "account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") float money);

}

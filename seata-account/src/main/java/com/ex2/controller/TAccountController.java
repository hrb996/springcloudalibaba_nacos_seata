package com.ex2.controller;


import com.ex2.cloudcommons.entity.CommonResult;
import com.ex2.service.TAccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 账户表 前端控制器
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
@RestController
public class TAccountController {
    @Resource
    private TAccountService tAccountService;
    @PostMapping(value = "account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") float money) {
        tAccountService.decrease(userId, money);
        System.out.println("扣减账户余额成功");
        return new CommonResult(200, "扣减账户余额成功");
    }
}


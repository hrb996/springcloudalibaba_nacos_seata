package com.ex2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ex2.entity.TAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 账户表 Mapper 接口
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
@Mapper
public interface TAccountMapper extends BaseMapper<TAccount> {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    @Update("update t_account set residue = residue- #{money},used = used + #{money} where user_id =#{userId}")
    int decrease(@Param("userId") Long userId, @Param("money") float money);
}

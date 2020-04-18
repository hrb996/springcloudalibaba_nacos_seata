package com.ex2.mapper;

import com.ex2.entity.TOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author hrb
 * @since 2020-04-16
 */
public interface TOrderMapper extends BaseMapper<TOrder> {
    /**
     * 1 新建订单
     * @param order
     * @return
     */
    @Insert(" insert into t_order(user_id,product_id,count,money,status) values (#{userId},#{productId},#{count},#{money},0)")
    int create(TOrder order);

    /**
     * 2 修改订单状态,从0改为1
     * @param userId
     * @param status
     * @return
     */
    @Update("update t_order set status =1 where user_id =#{userId} and status=#{status}")
    int update(@Param("userId") Long userId, @Param("status") Integer status);

}

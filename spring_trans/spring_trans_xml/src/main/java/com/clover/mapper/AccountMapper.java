package com.clover.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    @Update(" update userinfo.user set user.money = user.money + #{money} where user.username = #{username}")
    void incrMoney(@Param("username") String username, @Param("money") Integer money);
    @Update("update userinfo.user set user.money = user.money - #{money} where user.username = #{username}")
    void decrMoney(@Param("username") String username, @Param("money") Integer money);
}
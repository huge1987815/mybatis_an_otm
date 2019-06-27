package com.huge.mapper;

import com.huge.entity.Account;
import com.huge.entity.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;


import java.util.List;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/27-15:15
 */
public interface AccountMapper {
    //查询所有账户信息
    @Select("select * from tb_account")
    @Results({
            @Result(id = true,column = "aid",property ="aid"),
            @Result(property = "uid",column = "uid"),
            @Result(property = "money",column = "money"),
            @Result(property = "user",column = "uid",javaType = User.class,
            one =@One(select="com.huge.mapper.UserMapper.getUser",fetchType= FetchType.DEFAULT))
    })
    List<Account> findAllAccountWithUser();

    //通过用户ID查询账户信息
    @Select("select * from tb_account where uid=#{uid}")
    List<Account> findAccountWithById(int uid);
}

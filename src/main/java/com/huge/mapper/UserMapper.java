package com.huge.mapper;


import com.huge.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/22-18:07
 */
public interface UserMapper {
   /**
    *获取用户对象
    * */
   @Select("select * from tb_user where uid=#{uid}")
   User getUser(int uid);

   /**
    *查询所有用户User的集合
    * */
   @Select("select * from tb_user")
   @Results(value = {
           @Result(id = true, property = "uid", column = "uid"),
           @Result(property = "uname", column = "uname"),
           @Result(property = "sex", column = "sex"),
           @Result(property = "birthdate", column = "birthdate"),
           @Result(property = "address", column = "address"),
           @Result(property = "account", column = "uid",
                   many = @Many(select = "com.huge.mapper.AccountMapper.findAllAccountWithUser", fetchType = FetchType.DEFAULT))
   })
   List<User> listUser();
}

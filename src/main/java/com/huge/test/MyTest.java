package com.huge.test;

import com.huge.entity.Account;
import com.huge.entity.User;
import com.huge.mapper.AccountMapper;
import com.huge.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Before;
import org.junit.Test;


import javax.swing.text.StyledEditorKit;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

/**
 * Description:变量描述
 * Author:胡正林823865618@qq.com)
 * Date:2019/6/23-19:03
 */
public class MyTest {
    /**
     * 提供全局私有属性
     * */
    private SqlSessionFactory ssf;
    /**
     * 给私有属性赋值
     * */
    @Before
    public void init() throws IOException {
        //获取Mybatis主流配置信息
        InputStream stream = Resources.getResourceAsStream("mybatis.xml");
        //获得SqlSessionFactory工厂会话
        ssf = new SqlSessionFactoryBuilder().build(stream);
    }


   //查询所有用户的信息
    @Test
    public void listaccount(){
        //获取SqlSession对象
        SqlSession session = ssf.openSession();
        //生成SqlSession接口mapper代理对象
        UserMapper mapper = session.getMapper(UserMapper.class);
        //调用代理对象方法
        List<User> list = mapper.listUser();
        //查询
        for (User user : list) {
            System.out.println(user);
        }
        //释放资源
        session.close();
    }
}

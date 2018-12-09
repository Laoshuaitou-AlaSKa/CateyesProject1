package com.zhbit210.model.serviceImpl;

import com.zhbit210.model.dao.UserMapper;
import com.zhbit210.model.dao.UserMessageMapper;
import com.zhbit210.model.pojo.User;
import com.zhbit210.model.pojo.UserMessage;
import com.zhbit210.model.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class UserServiceImpl implements UserService{
    private SqlSession sqlSession01;
    private UserMapper userMapper;
    private SqlSession sqlSession02;
    private UserMessageMapper userMessageMapper;

    public UserServiceImpl() throws IOException {
        this.sqlSession01 =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.userMapper = sqlSession01.getMapper(UserMapper.class);
        this.sqlSession02 =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.userMessageMapper = sqlSession02.getMapper(UserMessageMapper.class);
    }

    @Override
    public int login(User request) {
        User standard = userMapper.selectUserByUsername(request.getUsername());
        if (request.getPassword().equals(standard.getPassword())){
            System.out.println("用户 " + userMessageMapper.selectUserMessageByUserId((int)standard.getId()).getName() + " 登陆成功！");
            return (int)standard.getId();
        }else {
            System.out.println("密码错误！请重新输入。");
            return 0;
        }
    }

    @Override
    public void regist(User request, UserMessage messageRequest) {
         if (userMapper.selectUsenameIsNull(request.getUsername())==1){
             System.out.println("用户名已被注册，请直接登录。");
             return;
         }else if (userMapper.selectUsenameIsNull(request.getUsername())==0){
             userMapper.createUser(request);
             User newUser = userMapper.selectUserByUsername(request.getUsername());
             messageRequest.setUserid(newUser.getId());
             userMessageMapper.createUserMessage(messageRequest);
             sqlSession01.commit();
             sqlSession02.commit();
             System.out.println("用户 " + messageRequest.getName() + " 注册成功！");
             return;
         }
    }
}

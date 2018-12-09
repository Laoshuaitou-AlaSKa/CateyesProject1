package com.zhbit210.model.serviceImpl;

import com.zhbit210.model.dao.UserMapper;
import com.zhbit210.model.dao.UserMessageMapper;
import com.zhbit210.model.pojo.User;
import com.zhbit210.model.pojo.UserMessage;
import com.zhbit210.model.service.UserMessageService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class UserMessageServiceImpl implements UserMessageService {
    private SqlSession sqlSession02;
    private UserMessageMapper userMessageMapper;

    public UserMessageServiceImpl() throws IOException {
        this.sqlSession02 =  new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.userMessageMapper = sqlSession02.getMapper(UserMessageMapper.class);
    }

    @Override
    public UserMessage showUserMessage(int userId) {
        UserMessage userMessage = userMessageMapper.selectUserMessageByUserId(userId);
        System.out.println(userMessage);
        return userMessage;
    }

    @Override
    public void changeUserMessage(int userId,UserMessage userMessage) {
        userMessage.setUserid(userId);
        userMessageMapper.updateUserMessage(userMessage);
        sqlSession02.commit();
        System.out.println(userMessageMapper.selectUserMessageByUserId((int)userMessage.getUserid()));
    }
}

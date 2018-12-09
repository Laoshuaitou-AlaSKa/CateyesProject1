package com.zhbit210.model.dao;

import com.zhbit210.model.pojo.UserMessage;

import java.util.List;

public interface UserMessageMapper {
    UserMessage selectUserMessageByUserId(int userId);

    List<UserMessage> selectAllUserMessage();

    void createUserMessage(UserMessage userMessage);

    void updateUserMessage(UserMessage userMessage);
}

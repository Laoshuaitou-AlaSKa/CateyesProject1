package com.zhbit210.model.service;

import com.zhbit210.model.pojo.User;
import com.zhbit210.model.pojo.UserMessage;

public interface UserMessageService {
    UserMessage showUserMessage(int userId);

    void changeUserMessage(int userId,UserMessage userMessage);
}

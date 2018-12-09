package com.zhbit210.model.service;

import com.zhbit210.model.pojo.User;
import com.zhbit210.model.pojo.UserMessage;

public interface UserService {
    int login(User request);

    void regist(User request,UserMessage messageRequest);
}

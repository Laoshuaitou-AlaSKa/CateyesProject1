package com.zhbit210.model.dao;

import com.zhbit210.model.pojo.User;

public interface UserMapper {
    int selectUsenameIsNull(String username);

    User selectUserByUsername(String username);

    void createUser(User user);

    void updateUser(User user);
}

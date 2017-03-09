package com.recive.mapper;

import java.util.List;

import com.recive.model.User;

public interface UserMapper {

    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    List<User> findAll();
}

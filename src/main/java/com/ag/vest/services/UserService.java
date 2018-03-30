package com.ag.vest.services;

import java.util.List;

import com.ag.vest.model.User;

public interface UserService {

    public User create(User user);

    public User delete(int id);

    public List<User> findAll();

    public User findById(int id);

    public User update(User user);
}

package com.ag.vest.dao.repository;

import org.springframework.data.repository.Repository;

import com.ag.vest.model.User;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
}

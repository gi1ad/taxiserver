package com.gi1ad.taxiserver.service;

import com.gi1ad.taxiserver.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(long id);

    User save (User user);

    void remove (long id);
}

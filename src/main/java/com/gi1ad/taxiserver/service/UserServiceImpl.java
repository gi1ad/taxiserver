package com.gi1ad.taxiserver.service;

import com.gi1ad.taxiserver.entity.User;
import com.gi1ad.taxiserver.repository.TaxiRepository;
import com.gi1ad.taxiserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;


    public List<User> getAll() {
        return repository.findAll();
    }


    public User getById(long id) {
        return repository.getOne(id);
    }


    public User save(User user) {
        return repository.saveAndFlush(user);
    }


    public void remove(long id) {
        repository.deleteById(id);
    }
}

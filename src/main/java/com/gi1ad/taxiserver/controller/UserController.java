package com.gi1ad.taxiserver.controller;


import com.gi1ad.taxiserver.entity.User;
import com.gi1ad.taxiserver.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl service;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUsers() {
        return service.getAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
        public User saveUser(@RequestBody User user){
        return service.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete (@PathVariable long id){
        service.remove(id);
    }



}

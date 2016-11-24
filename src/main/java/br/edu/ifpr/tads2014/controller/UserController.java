package br.edu.ifpr.tads2014.controller;


import br.edu.ifpr.tads2014.persist.entity.User;
import br.edu.ifpr.tads2014.persist.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody
    List<User> usersList() {
        return userRepo.findAll();
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public @ResponseBody
    User getUser(@PathVariable Long userId) {
        return userRepo.findOne(userId);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public @ResponseBody
    User saveUser(@RequestBody User user) {
        userRepo.save(user);
        return user;
    }


}

 

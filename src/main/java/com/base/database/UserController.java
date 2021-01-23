package com.base.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public Iterable<User> getUsers(){
        User user = new User();
        user.setEmail("posp.piotr@gmail.com");
        user.setName("Piotr");
        userRepository.save(user);

        User user1 = new User();
        user1.setEmail("val@gmail.com");
        user1.setName("Valfare");
        userRepository.save(user1);

        return userRepository.findAll();
    }
}

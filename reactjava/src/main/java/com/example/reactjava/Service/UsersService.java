package com.example.reactjava.Service;

import com.example.reactjava.Entity.Users;
import com.example.reactjava.Repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

//    public UsersService(UsersRepository usersRepository) {
//        this.usersRepository = usersRepository;
//    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public Users saveUser(Users users) {
        users.setId(new Random().nextInt());
        return usersRepository.save(users);
    }
}

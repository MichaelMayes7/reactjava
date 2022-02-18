package com.example.reactjava.Controller;

import com.example.reactjava.Entity.Users;
import com.example.reactjava.Links.UserLinks;
import com.example.reactjava.Service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping(path = UserLinks.LIST_USERS)
    public ResponseEntity<?> listUsers() {
        log.info("UsersController: list users");
        List<Users> resource = usersService.getUsers();
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = UserLinks.ADD_USER)
    public ResponseEntity<Users> saveUser(@RequestBody Users user) {
        log.info("UsersController: list users");
        Users resource = usersService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}

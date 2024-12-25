package com.example.Tiba_Car.Services;


import com.example.Tiba_Car.Entityes.Users;
import com.example.Tiba_Car.Repository.UserRepositrory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class UsreService {
    private final UserRepositrory userRepositrory;
    @Autowired
    public UsreService(UserRepositrory userRepositrory) {
        this.userRepositrory = userRepositrory;
    }

    public List<Users> login(){
      return userRepositrory.findAll();
    }
}

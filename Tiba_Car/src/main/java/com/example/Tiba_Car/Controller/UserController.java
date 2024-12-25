package com.example.Tiba_Car.Controller;

import com.example.Tiba_Car.Entityes.Users;
import com.example.Tiba_Car.Services.UsreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UsreService usreService;


    @Autowired
    public UserController(UsreService usreService) {
        this.usreService = usreService;
    }
    @GetMapping
    public List<Users> usr(){
        return usreService.login();
    }

}

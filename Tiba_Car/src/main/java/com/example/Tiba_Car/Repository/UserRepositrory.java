package com.example.Tiba_Car.Repository;

import com.example.Tiba_Car.Entityes.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositrory extends
        JpaRepository<Users,Long>{

}

package com.example.Tiba_Car.Entityes;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
@Table
public class Users {
    @Id
    @SequenceGenerator(
            name = "users_sequence",
            sequenceName = "users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_sequence"
    )
    private long id;
    private String FullName;
    private LocalDate date_Of_Birth;
    private String Phone;
    private String Email;
    private String Password;

    public Users() {
    }

    public Users(long id, String fullName, LocalDate date_Of_Birth, String phone, String email, String password) {
        this.id = id;
        FullName = fullName;
        this.date_Of_Birth = date_Of_Birth;
        Phone = phone;
        Email = email;
        Password = password;
    }

    public Users(String fullName, LocalDate date_Of_Birth, String phone, String email, String password) {
        FullName = fullName;
        this.date_Of_Birth = date_Of_Birth;
        Phone = phone;
        Email = email;
        Password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public LocalDate getDate_Of_Birth() {
        return date_Of_Birth;
    }

    public void setDate_Of_Birth(LocalDate date_Of_Birth) {
        this.date_Of_Birth = date_Of_Birth;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

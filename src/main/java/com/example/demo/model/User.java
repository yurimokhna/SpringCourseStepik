package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}

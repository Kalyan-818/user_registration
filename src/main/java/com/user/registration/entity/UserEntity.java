package com.user.registration.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_information")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String confirmPassword;

}

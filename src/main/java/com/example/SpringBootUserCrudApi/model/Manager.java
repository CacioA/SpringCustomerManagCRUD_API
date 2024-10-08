package com.example.SpringBootUserCrudApi.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="manager")
@Data
public class Manager {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;
}

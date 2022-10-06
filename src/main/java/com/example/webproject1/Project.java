package com.example.webproject1;

import javax.persistence.*;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String description;
    //private User user;
}

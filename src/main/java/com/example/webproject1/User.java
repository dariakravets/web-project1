package com.example.webproject1;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;

    private String position;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private ArrayList<Project> portfolio;
    //private ArrayList<Project> portfolio;
    public User() { }
    public User(ArrayList<Project> p) {
        portfolio = (ArrayList<Project>) p.clone();
    }

    public User(Integer id, String firstName, String lastName, String position, ArrayList<Project> portfolio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.position = position;
        this.portfolio = portfolio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Project> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList<Project> portfolio) {
        this.portfolio = portfolio;
    }
}
package com.ironhack.FinalProject.Class.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends User {

    public Admin(String name, String password) {
        super(name, password);
    }

    public Admin() {
    }

}

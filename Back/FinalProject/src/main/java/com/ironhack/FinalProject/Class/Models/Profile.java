package com.ironhack.FinalProject.Class.Models;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name="profile")
public class Profile extends User {

    @Enumerated(EnumType.STRING)
    private Allergen allergen;

    public Profile(String name, String password, Allergen allergen) {
        super(name, password);
        this.allergen = allergen;
    }

    public Profile() {
    }

    public Allergen getAllergen() {
        return allergen;
    }

    public void setAllergen(Allergen allergen) {
        this.allergen = allergen;
    }
}

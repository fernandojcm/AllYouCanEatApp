package com.ironhack.FinalProject.Controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProfileDTO {

    @NotNull
    private String allergen;

    @NotNull
    private String name;

    @NotNull
    @NotBlank
    private String password;

    public ProfileDTO(String allergen, String name, String password) {
        this.allergen = allergen;
        this.name = name;
        this.password = password;
    }

    public ProfileDTO() {
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

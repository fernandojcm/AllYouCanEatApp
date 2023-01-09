package com.ironhack.FinalProject.Controller.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class DishDTO {

    @NotNull
    private String allergen;

    @NotNull
    private String name;

    @NotNull
    private String recipe;

    private String restaurant;

    public DishDTO(String allergen, String name, String recipe, String restaurant) {
        this.allergen = allergen;
        this.name = name;
        this.recipe = recipe;
        this.restaurant = restaurant;
    }

    public DishDTO(String allergen, String name, String recipe) {
        this.allergen = allergen;
        this.name = name;
        this.recipe = recipe;
    }

    public DishDTO() {
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

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
}

package com.ironhack.FinalProject.Class.Models;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import jakarta.persistence.*;

@Entity
@Table(name="dish")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Allergen allergen;

    private String name;

    private String recipe;

    private String restaurant;

    public Dish(Allergen allergen, String name, String recipe, String restaurant) {
        this.allergen = allergen;
        this.name = name;
        this.recipe = recipe;
        this.restaurant = restaurant;
    }

    public Dish(Allergen allergen, String name, String recipe) {
        this.allergen = allergen;
        this.name = name;
        this.recipe = recipe;
    }

    public Dish() {
    }

    public Integer getId() {
        return id;
    }


    public Allergen getAllergen() {
        return allergen;
    }

    public void setAllergen(Allergen allergen) {
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

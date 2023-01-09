package com.ironhack.FinalProject.Controller.interfaces;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Dish;

import java.util.List;
import java.util.Optional;

public interface IDishController {
    Optional<Dish> getDishById(Integer id);

    List<Dish> getDishByAllergen(String allergen);

    List<Dish> getDishByRestaurant(String restaurant);
}

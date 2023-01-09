package com.ironhack.FinalProject.Service.interfaces;

import com.ironhack.FinalProject.Class.Models.Dish;

import java.util.Optional;

public interface IDishService {

    Optional<Dish> findDishById(Integer id);
}

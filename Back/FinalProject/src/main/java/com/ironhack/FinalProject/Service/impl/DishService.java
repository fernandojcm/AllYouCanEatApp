package com.ironhack.FinalProject.Service.impl;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Dish;
import com.ironhack.FinalProject.Controller.dto.DishDTO;
import com.ironhack.FinalProject.Repository.DishRepository;
import com.ironhack.FinalProject.Service.interfaces.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DishService implements IDishService {

    @Autowired
    DishRepository dishRepository;

    public Optional<Dish> findDishById(Integer id) {
        Optional<Dish> dish = dishRepository.findById(id);
        if(dish.isPresent()){
            return dish;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't exist.");
        }
    }


    public List<Dish> findDishByRestaurant(String restaurant){
        List<Dish> dishList = dishRepository.findByRestaurant(restaurant);
        if(dishList.size() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, we don't have information for this restaurant.");
        }else {
            return dishList;
        }
    }

    public List<Dish> findDishByAllergen(String allergen){

        try{
            return dishRepository.findByAllergen(Allergen.valueOf(allergen.toUpperCase()));
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, we don't have information for this ingredient.");
        }

    }

    public void createDish(DishDTO dishDTO){

        Allergen allergen = Allergen.valueOf(dishDTO.getAllergen().toUpperCase());

        String name = dishDTO.getName();

        String recipe = dishDTO.getRecipe();

        if (dishDTO.getRestaurant() != null){
            String restaurant = dishDTO.getRestaurant();
            Dish dish = new Dish(allergen, name, recipe, restaurant);
            dishRepository.save(dish);
        }else{
            Dish dish = new Dish(allergen, name, recipe);
            dishRepository.save(dish);
        }
    }

    public void updateDish(Integer id, DishDTO dishDTO){
        Optional<Dish> dishToUpdate = dishRepository.findById(id);
        if(dishToUpdate.isPresent()){
            Dish dish = dishToUpdate.get();
            dish.setAllergen(Allergen.valueOf(dishDTO.getAllergen().toUpperCase()));
            dish.setName(dishDTO.getName());
            dish.setRecipe(dishDTO.getRecipe());
            if (dishDTO.getRestaurant() != null){
                dish.setRestaurant(dishDTO.getRestaurant());
            }
            dishRepository.save(dish);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't exist.");
        }
    }

}

package com.ironhack.FinalProject.Controller.impl;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Dish;
import com.ironhack.FinalProject.Controller.dto.DishDTO;
import com.ironhack.FinalProject.Controller.interfaces.IDishController;
import com.ironhack.FinalProject.Repository.DishRepository;
import com.ironhack.FinalProject.Service.impl.DishService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DishController implements IDishController {

    @Autowired
    DishRepository dishRepository;
    @Autowired
    DishService dishService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/dishes")
    @ResponseStatus(HttpStatus.OK)
    public List<Dish> getDish(){
        return dishRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/dishes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Dish> getDishById(@PathVariable Integer id) {
        return dishService.findDishById(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/dishes/allergen/{allergen}")
    @ResponseStatus(HttpStatus.OK)
    public List<Dish> getDishByAllergen(@PathVariable String allergen){
        return dishService.findDishByAllergen(allergen);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/dishes/restaurant/{restaurant}")
    @ResponseStatus(HttpStatus.OK)
    public List<Dish> getDishByRestaurant(@PathVariable String restaurant){
        return dishService.findDishByRestaurant(restaurant);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/dishes/dish/created")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDish(@RequestBody @Valid DishDTO dishDTO){
        dishService.createDish(dishDTO);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/dishes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDish(@PathVariable Integer id,  @RequestBody @Valid DishDTO dishDTO){
        dishService.updateDish(id, dishDTO);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/dishes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void  deleteDish(@PathVariable Integer id){
        dishRepository.deleteById(id);
    }
}

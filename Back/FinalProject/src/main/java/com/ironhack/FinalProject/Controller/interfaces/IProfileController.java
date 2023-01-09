package com.ironhack.FinalProject.Controller.interfaces;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Profile;

import java.util.List;
import java.util.Optional;

public interface IProfileController {

    Optional<Profile> getProfileById(Integer id);

    List<Profile> getProfileByAllergen(String allergen);
}

package com.ironhack.FinalProject.Controller.impl;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Profile;
import com.ironhack.FinalProject.Controller.dto.ProfileDTO;
import com.ironhack.FinalProject.Controller.interfaces.IProfileController;
import com.ironhack.FinalProject.Repository.ProfileRepository;
import com.ironhack.FinalProject.Service.impl.ProfileService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfileController implements IProfileController {

    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    ProfileService profileService;

    @GetMapping("/profiles")
    @ResponseStatus(HttpStatus.OK)
    public List<Profile> getProfiles(){
        return profileRepository.findAll();
    }

    @GetMapping("/profiles/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Profile> getProfileById(@PathVariable Integer id) {
        return profileService.findProfileById(id);
    }

    @GetMapping("/profiles/allergen/{allergen}")
    @ResponseStatus(HttpStatus.OK)
    public List<Profile> getProfileByAllergen(@PathVariable String allergen){
        return profileService.findProfileByAllergen(allergen);
    }

    @PostMapping("/profiles/profile/created")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProfile(@RequestBody @Valid ProfileDTO profileDTO){
        profileService.createProfile(profileDTO);
    }

    @DeleteMapping("/profiles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@PathVariable Integer id){
        profileRepository.deleteById(id);
    }


}

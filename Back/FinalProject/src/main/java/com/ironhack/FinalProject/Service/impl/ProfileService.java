package com.ironhack.FinalProject.Service.impl;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Profile;
import com.ironhack.FinalProject.Controller.dto.ProfileDTO;
import com.ironhack.FinalProject.Repository.ProfileRepository;
import com.ironhack.FinalProject.Service.interfaces.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public Optional<Profile> findProfileById(Integer id) {
        Optional<Profile> profile = profileRepository.findById(id);
        if(profile.isPresent()){
            return profile;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't exist.");
        }
    }

    public List<Profile> findProfileByAllergen(String allergen){

        try{
            return profileRepository.findByAllergen(Allergen.valueOf(allergen.toUpperCase()));
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, we don't have information for this ingredient.");
        }
    }

    public void createProfile(ProfileDTO profileDTO){

        Allergen allergen = Allergen.valueOf(profileDTO.getAllergen().toUpperCase());

        String name = profileDTO.getName();

        String password = profileDTO.getPassword();

        Profile profile = new Profile(name, password, allergen);
        profileRepository.save(profile);
    }
}

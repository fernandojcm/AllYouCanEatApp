package com.ironhack.FinalProject.Service.impl;

import com.ironhack.FinalProject.Class.Classes.Allergen;
import com.ironhack.FinalProject.Class.Models.Profile;
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

}

package com.ironhack.FinalProject.Service.interfaces;

import com.ironhack.FinalProject.Class.Models.Profile;

import java.util.Optional;

public interface IProfileService {
    Optional<Profile> findProfileById(Integer id);

}

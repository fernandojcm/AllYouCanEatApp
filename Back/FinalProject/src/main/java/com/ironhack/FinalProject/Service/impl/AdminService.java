package com.ironhack.FinalProject.Service.impl;

import com.ironhack.FinalProject.Repository.AdminRepository;
import com.ironhack.FinalProject.Service.interfaces.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {

    @Autowired
    AdminRepository adminRepository;


}

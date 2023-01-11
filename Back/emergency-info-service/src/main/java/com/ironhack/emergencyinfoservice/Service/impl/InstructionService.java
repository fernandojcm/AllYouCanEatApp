package com.ironhack.emergencyinfoservice.Service.impl;

import com.ironhack.emergencyinfoservice.Models.Instruction;
import com.ironhack.emergencyinfoservice.Repository.InstructionRepository;
import com.ironhack.emergencyinfoservice.Service.interfaces.IInstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class InstructionService implements IInstructionService {

    @Autowired
    InstructionRepository instructionRepository;

    public Optional<Instruction> findInstructionById(Integer id) {
        Optional<Instruction> instruction = instructionRepository.findById(id);
        if(instruction.isPresent()){
            return instruction;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id doesn't exist.");
        }
    }

}

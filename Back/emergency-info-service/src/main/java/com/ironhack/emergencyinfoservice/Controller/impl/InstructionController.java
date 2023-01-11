package com.ironhack.emergencyinfoservice.Controller.impl;

import com.ironhack.emergencyinfoservice.Controller.interfaces.IInstructionController;
import com.ironhack.emergencyinfoservice.Models.Instruction;
import com.ironhack.emergencyinfoservice.Repository.InstructionRepository;
import com.ironhack.emergencyinfoservice.Service.impl.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InstructionController implements IInstructionController {

    @Autowired
    InstructionRepository instructionRepository;

    @Autowired
    InstructionService instructionService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/instructions")
    @ResponseStatus(HttpStatus.OK)
    public List<Instruction> getInstruction(){
        return instructionRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/instructions/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Instruction> getInstructionById(@PathVariable Integer id) {
        return instructionService.findInstructionById(id);
    }
}

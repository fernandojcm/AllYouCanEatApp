package com.ironhack.emergencyinfoservice.Controller.interfaces;

import com.ironhack.emergencyinfoservice.Models.Instruction;

import java.util.Optional;

public interface IInstructionController {

    Optional<Instruction> getInstructionById(Integer id);
}

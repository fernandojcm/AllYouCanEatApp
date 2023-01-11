package com.ironhack.emergencyinfoservice.Service.interfaces;

import com.ironhack.emergencyinfoservice.Models.Instruction;

import java.util.Optional;

public interface IInstructionService {

    Optional<Instruction> findInstructionById(Integer id);
}

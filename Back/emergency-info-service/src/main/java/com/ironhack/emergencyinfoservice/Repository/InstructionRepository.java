package com.ironhack.emergencyinfoservice.Repository;

import com.ironhack.emergencyinfoservice.Models.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionRepository extends JpaRepository<Instruction, Integer> {

}

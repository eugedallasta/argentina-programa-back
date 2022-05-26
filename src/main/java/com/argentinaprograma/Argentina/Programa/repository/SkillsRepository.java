package com.argentinaprograma.Argentina.Programa.repository;

import com.argentinaprograma.Argentina.Programa.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long>{
    
}
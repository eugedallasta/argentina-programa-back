
package com.argentinaprograma.Argentina.Programa.service;

import com.argentinaprograma.Argentina.Programa.model.Skills;
import com.argentinaprograma.Argentina.Programa.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService  {
    
    private final SkillsRepository skillsRepository;
    
    @Autowired
    public SkillsService(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }
    
    public Skills addSkills(Skills skill){
        return skillsRepository.save(skill);
    }
    
    public List<Skills> buscarSkills(){
        return skillsRepository.findAll();
    }
    
    public Skills editarSkills(Skills skill){
        return skillsRepository.save(skill);
    }
    
    public void borrarSkills(Long id){
        skillsRepository.deleteById(id);
    }
    
    
    
    
}

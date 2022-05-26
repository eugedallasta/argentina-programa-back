
package com.argentinaprograma.Argentina.Programa.service;

import com.argentinaprograma.Argentina.Programa.model.Persona;
import com.argentinaprograma.Argentina.Programa.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    
    private final PersonaRepository personaRepository;
    
    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    public Persona addPersona(Persona persona){
        return personaRepository.save(persona);
    }
    
    public List<Persona> buscarPersona(){
        return personaRepository.findAll();
    }
    
    public Persona editarPersona(Persona persona){
        return personaRepository.save(persona);
    }
    
    public void borrarPersona(Long id){
        personaRepository.deleteById(id);
    }
    
    public Persona buscarPersonaId(Long id){
        return personaRepository.findById(id).orElse(null);
    }
    
    
    
}


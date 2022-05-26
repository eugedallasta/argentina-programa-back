
package com.argentinaprograma.Argentina.Programa.repository;


import com.argentinaprograma.Argentina.Programa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
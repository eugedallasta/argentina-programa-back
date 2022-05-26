
package com.argentinaprograma.Argentina.Programa.repository;



import com.argentinaprograma.Argentina.Programa.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}



package com.argentinaprograma.Argentina.Programa.service;



import com.argentinaprograma.Argentina.Programa.model.Educacion;
import com.argentinaprograma.Argentina.Programa.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepository educacionrepository;
    
    @Autowired
    public EducacionService(EducacionRepository educacionrepository) {
        this.educacionrepository = educacionrepository;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionrepository.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionrepository.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionrepository.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionrepository.deleteById(id);
    }
}

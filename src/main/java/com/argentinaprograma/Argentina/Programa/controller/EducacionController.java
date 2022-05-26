
package com.argentinaprograma.Argentina.Programa.controller;

import com.argentinaprograma.Argentina.Programa.model.Educacion;
import com.argentinaprograma.Argentina.Programa.service.EducacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    
    private final EducacionService educacionservice;
    
    public EducacionController(EducacionService educacionservice) {
        this.educacionservice = educacionservice;
    }
    
    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
    Educacion updateEducacion = educacionservice.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List <Educacion> educaciones = educacionservice.buscarEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionservice.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionservice.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
}

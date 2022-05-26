package com.argentinaprograma.Argentina.Programa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String fotoPerfil;
    
    
    @OneToMany(fetch = FetchType.LAZY , mappedBy="idEdu")
    private List <Educacion> educacionList;
    
    @OneToMany(fetch = FetchType.LAZY , mappedBy="idExp")
    private List <Experiencia> experienciaList;
    
    @OneToMany(fetch = FetchType.LAZY , mappedBy="idSkill")
    private List <Skills> skillslist;
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripcion, String fotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
    }

   
    
    
    
}
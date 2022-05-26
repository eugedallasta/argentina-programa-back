
package com.argentinaprograma.Argentina.Programa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private String descripcionExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaExp, String descripcionExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.descripcionExp = descripcionExp;
        this.imagenExp = imagenExp;
    }
    
    
    
}
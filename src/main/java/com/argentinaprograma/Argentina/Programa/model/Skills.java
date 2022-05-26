
package com.argentinaprograma.Argentina.Programa.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private int porcentaje;
    private String imgSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int porcentaje, String ImgSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.porcentaje = porcentaje;
        this.imgSkill = imgSkill;
    }
}
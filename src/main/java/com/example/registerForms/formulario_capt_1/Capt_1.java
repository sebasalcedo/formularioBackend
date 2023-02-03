/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registerForms.formulario_capt_1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author sebas
 */

@Entity
@Table( name = "capt_1")
public class Capt_1 {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    @Column
    private String nacionalidad;
    @Column
    private String residencia;
    @Column
    private String sexo;
    @Column
    private String edad;
    @Column
    private String q1_con_quien_viaja;
    @Column
    private String q2_cantidad_personas;
    @Column
    private String personas_FR;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getQ1_con_quien_viaja() {
        return q1_con_quien_viaja;
    }

    public void setQ1_con_quien_viaja(String q1_con_quien_viaja) {
        this.q1_con_quien_viaja = q1_con_quien_viaja;
    }

    public String getQ2_cantidad_personas() {
        return q2_cantidad_personas;
    }

    public void setQ2_cantidad_personas(String q2_cantidad_personas) {
        this.q2_cantidad_personas = q2_cantidad_personas;
    }

    public String getPersonas_FR() {
        return personas_FR;
    }

    public void setPersonas_FR(String personas_FR) {
        this.personas_FR = personas_FR;
    }
    
}

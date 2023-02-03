/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.registerForms;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author sebas
 */
public interface PersonaRepositorio extends Repository<Persona, Integer>{
    
    List<Persona>findAll();
    Persona findOne( int id);
    Persona save(Persona p);
    void delete( int id );
    
    
}

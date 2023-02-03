/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registerForms;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sebas
 */

@Service

public class PersonaServiceImp implements PersonaService{

     @Autowired
     
     private PersonaRepositorio repositorio;
    
    @Override
    public List<Persona> Listar() {
        return repositorio.findAll();   
         }

    @Override
    public Persona listarId(int id) {
return repositorio.findOne(id)  ;
        
        }

    @Override
    public Persona add(Persona p) {
                return   repositorio.save(p);
         }

    @Override
    public Persona edit(Persona p) {

        return repositorio.save(p);

    }

    @Override
    public Persona delete(int id) {
    Persona p = repositorio.findOne(id);
    if(p!=null){
        repositorio.delete(id);
    }
    return p;    
    }
    
        
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registerForms;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author sebas
 */

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})

public class controller {
    
    @Autowired
    PersonaService service;
    
    
    @GetMapping
    public List<Persona>listar(){
        return service.Listar();
    }
    
    
    @PostMapping
    
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    
    
    @GetMapping(path ={"/{id}"})
    
    public Persona listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping( path = {"/{id}"})
    
    public Persona editar(@RequestBody Persona p, @PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    
     @DeleteMapping( path = {"/{id}"})   
     
     public Persona delete(@PathVariable("id") int id){
         return service.delete(id);
     }
    
}

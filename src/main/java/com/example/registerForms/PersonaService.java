/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.registerForms;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface PersonaService {
    
    List<Persona>Listar();
    
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int p);
    
    
}

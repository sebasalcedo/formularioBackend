/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.registerForms.formulario_capt_1;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface Capt_1Service {
     List<Capt_1>Listar();
    
    Capt_1 listarId(int id);
    Capt_1 add(Capt_1 p);
    Capt_1 edit(Capt_1 p);
    Capt_1 delete(int p);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.registerForms.formulario_capt_1;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author sebas
 */
public interface Capt_1Repositorio extends Repository<Capt_1, Integer>{
     List<Capt_1>findAll();
    Capt_1 findOne( int id);
    Capt_1 save(Capt_1 p);
    void delete( int id );
}

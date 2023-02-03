/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.registerForms.formulario_capt_1;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Capt_1ServiceImp implements Capt_1Service{
    
    private Capt_1Repositorio repositorio;

    @Override
    public List<Capt_1> Listar() {
        return repositorio.findAll();  
    }

    @Override
    public Capt_1 listarId(int id) {
        return repositorio.findOne(id);  
    
    }

    @Override
    public Capt_1 add(Capt_1 p) {
            return   repositorio.save(p);
    }

    @Override
    public Capt_1 edit(Capt_1 p) {
  return repositorio.save(p);
    }

    @Override
    public Capt_1 delete(int id) {
  Capt_1 p = repositorio.findOne(id);
    if(p!=null){
        repositorio.delete(id);
    }
    return p;       }
    
}

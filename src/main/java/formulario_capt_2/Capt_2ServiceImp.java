/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario_capt_2;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Capt_2ServiceImp implements Capt_2Service{
    
    private Capt_2Repositorio repositorio;
    
    
    @Override
    public List<Capt_2> Listar() {
        return repositorio.findAll();  
    }

    @Override
    public Capt_2 listarId(int id) {
        return repositorio.findOne(id);  
    
    }

    @Override
    public Capt_2 add(Capt_2 p) {
            return   repositorio.save(p);
    }

    @Override
    public Capt_2 edit(Capt_2 p) {
  return repositorio.save(p);
    }

    @Override
    public Capt_2 delete(int id) {
  Capt_2 p = repositorio.findOne(id);
    if(p!=null){
        repositorio.delete(id);
    }
    return p;     
    }
    
}

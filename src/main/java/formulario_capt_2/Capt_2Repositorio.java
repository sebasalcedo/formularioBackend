/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package formulario_capt_2;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author sebas
 */

public interface Capt_2Repositorio extends Repository<Capt_2, Integer>{
    
     List<Capt_2>findAll();
    Capt_2 findOne( int id);
    Capt_2 save(Capt_2 p);
    void delete( int id );
    
}

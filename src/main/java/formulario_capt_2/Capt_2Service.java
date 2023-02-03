/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package formulario_capt_2;

import java.util.List;

/**
 *
 * @author sebas
 */
public interface Capt_2Service {
     List<Capt_2>Listar();
    
    Capt_2 listarId(int id);
    Capt_2 add(Capt_2 p);
    Capt_2 edit(Capt_2 p);
    Capt_2 delete(int p);
}

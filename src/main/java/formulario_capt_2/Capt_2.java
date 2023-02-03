/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario_capt_2;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author sebas
 */

@Entity
@Table( name = "capt_2")
public class Capt_2 {
    
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    private int id;
    @Column
    private String q3_motivo_viaje;
    @Column
    private String q4_como_organizo_viaje;
    @Column
    private String q5_servicios_turisticos;
    @Column
    private String id_persona;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQ3_motivo_viaje() {
        return q3_motivo_viaje;
    }

    public void setQ3_motivo_viaje(String q3_motivo_viaje) {
        this.q3_motivo_viaje = q3_motivo_viaje;
    }

    public String getQ4_como_organizo_viaje() {
        return q4_como_organizo_viaje;
    }

    public void setQ4_como_organizo_viaje(String q4_como_organizo_viaje) {
        this.q4_como_organizo_viaje = q4_como_organizo_viaje;
    }

    public String getQ5_servicios_turisticos() {
        return q5_servicios_turisticos;
    }

    public void setQ5_servicios_turisticos(String q5_servicios_turisticos) {
        this.q5_servicios_turisticos = q5_servicios_turisticos;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }


    
}

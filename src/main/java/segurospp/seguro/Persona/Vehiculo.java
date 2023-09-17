package segurospp.seguro.Persona;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vehiculo {

    @Id
    @GeneratedValue
    private Integer vehiculo_id;
    @Basic
    private String marca;
    private String modelo;
    private int anio;

    // Getters y setters

}

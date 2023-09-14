package segurospp.seguro.Persona;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poliza_id;
    private String numeroPoliza;
    private String tipoPoliza;

    @OneToMany(mappedBy = "poliza", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos;

    // Getters y setters
    public Long getId() {
        return poliza_id;
    }

    public void setId(Long poliza_id) {
        this.poliza_id = poliza_id;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }
}

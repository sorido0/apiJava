package segurospp.seguro.Persona;

import jakarta.persistence.*;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehiculo_id;
    private String marca;
    private String modelo;
    private int anio;

    @ManyToOne
    @JoinColumn(name = "poliza_id")
    private Poliza poliza;

    // Getters y setters
    public Long getId() {
        return vehiculo_id;
    }

    public void setId(Long vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

package segurospp.seguro.Persona;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliente_id;
    @Basic
    private String nombre;
    private String email;
    private String telefono;
    private String cedula;

    // @Column(unique = true, nullable = false)
    // private String numeroPoliza;

    // @ManyToOne
    // @JoinColumn(name = "poliza_id")
    // private Poliza poliza;

    // @PrePersist
    // protected void onCreate() {
    // // Generar automáticamente el número de póliza aquí
    // // Puedes usar una lógica para crear un número único, por ejemplo, basado en
    // la
    // // fecha actual, una secuencia, etc.
    // // Aquí hay un ejemplo simple usando un número aleatorio de 6 dígitos y una
    // // letra aleatoria
    // String numeroGenerado = generateNumeroPoliza();
    // this.numeroPoliza = numeroGenerado;
    // }

    // private String generateNumeroPoliza() {
    // // Aquí puedes implementar la lógica para generar un número de póliza único
    // // Por ejemplo, puedes usar un generador de números aleatorios y letras
    // // Asegúrate de que el número generado sea único en tu sistema
    // // Este es solo un ejemplo simple, debes adaptarlo a tus necesidades
    // // Aquí estamos generando un número aleatorio de 6 dígitos y una letra
    // aleatoria
    // String numeros = "0123456789";
    // String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // StringBuilder builder = new StringBuilder();

    // // Generar 6 dígitos aleatorios
    // for (int i = 0; i < 6; i++) {
    // int index = (int) (Math.random() * numeros.length());
    // builder.append(numeros.charAt(index));
    // }

    // // Agregar una letra aleatoria
    // int letraIndex = (int) (Math.random() * letras.length());
    // builder.append(letras.charAt(letraIndex));

    // return builder.toString();
    // }

    // Getters y setters

}

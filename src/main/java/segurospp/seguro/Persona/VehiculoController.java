package segurospp.seguro.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/vehiculo")
@RequiredArgsConstructor
public class VehiculoController {

    private final VehiculoServices vehiculoServices;
    private final PolizaServices polizaServices;

    // // Crear un vehiculo
    // @PostMapping
    // public void crearVehiculo(@RequestBody Vehiculo vehiculo) {
    // vehiculoServices.crearVehiculo(vehiculo);
    // }

    @PostMapping
    public void crearVehiculo(@RequestBody Vehiculo vehiculo) {
        Long polizaId = vehiculo.getPoliza().getId(); // Obtener el ID de la póliza desde el JSON
        Poliza poliza = polizaServices.obtenerPolizaPorId(polizaId); // Cargar la póliza desde la base de datos

        if (poliza != null) {
            vehiculo.setPoliza(poliza); // Asignar la póliza al vehículo
            vehiculoServices.crearVehiculo(vehiculo); // Guardar el vehículo

        } else {
            // La póliza no existe, devolver una respuesta de error 404 (No encontrado)

        }
    }

}

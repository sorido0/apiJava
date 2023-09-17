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
    // // Crear un vehiculo

    @PostMapping()
    public void crearVehiculo(@RequestBody Vehiculo vehiculo) {
        vehiculoServices.crearVehiculo(vehiculo);
    }

}

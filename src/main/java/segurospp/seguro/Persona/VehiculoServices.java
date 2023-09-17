package segurospp.seguro.Persona;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehiculoServices {

    private final VehiculoRepository vehiculoRepository;

    public void crearVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

}

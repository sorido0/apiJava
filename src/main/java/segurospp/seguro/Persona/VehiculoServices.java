package segurospp.seguro.Persona;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoServices {

    private final VehiculoRepository vehiculoRepository;

    // @Autowired
    public VehiculoServices(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    // Métodos para la entidad Vehiculo

    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public Vehiculo obtenerVehiculoPorId(Long id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    public Vehiculo actualizarVehiculo(Long id, Vehiculo vehiculoActualizado) {
        if (vehiculoRepository.existsById(id)) {
            vehiculoActualizado.setId(id);
            return vehiculoRepository.save(vehiculoActualizado);
        }
        return null; // Manejar el caso en el que el vehiculo no existe
    }

    public void eliminarVehiculo(Long id) {
        vehiculoRepository.deleteById(id);
    }

}

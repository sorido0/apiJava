package segurospp.seguro.Persona;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolizaServices {

    private final PolizaRepository polizaRepository;

    // @Autowired
    public PolizaServices(PolizaRepository polizaRepository) {
        this.polizaRepository = polizaRepository;
    }

    // Métodos para la entidad Poliza
    public Poliza crearPoliza(Poliza poliza) {
        return polizaRepository.save(poliza);
    }

    public Poliza obtenerPolizaPorId(Long poliza_id) {
        return polizaRepository.findById(poliza_id).orElse(null);
    }

    public Poliza actualizarPoliza(Long poliza_id, Poliza polizaActualizada) {
        if (polizaRepository.existsById(poliza_id)) {
            polizaActualizada.setId(poliza_id);
            return polizaRepository.save(polizaActualizada);
        }
        return null; // Manejar el caso en el que la poliza no existe
    }

    public void eliminarPoliza(Long poliza_id) {
        polizaRepository.deleteById(poliza_id);
    }
}

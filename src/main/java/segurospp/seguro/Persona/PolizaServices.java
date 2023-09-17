package segurospp.seguro.Persona;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PolizaServices {

    private final PolizaRepository polizaRepository;

    public void crearPoliza(Poliza poliza) {
        polizaRepository.save(poliza);
    }

}

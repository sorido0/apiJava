package segurospp.seguro.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/poliza")
@RequiredArgsConstructor
public class PolizaController {

    private final PolizaServices polizaServices;

    // Crear una poliza
    @PostMapping
    public void crearPoliza(@RequestBody Poliza poliza) {
        polizaServices.crearPoliza(poliza);
    }

}

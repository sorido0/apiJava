package segurospp.seguro.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numero-poliza-cliente")
public class NumeroDePolizaClienteController {

    private final NumeroDePolizaClienteService numeroDePolizaClienteService;

    public NumeroDePolizaClienteController(NumeroDePolizaClienteService numeroDePolizaClienteService) {
        this.numeroDePolizaClienteService = numeroDePolizaClienteService;
    }

    @PostMapping
    public NumeroDePolizaCliente crearNumeroDePolizaCliente(@RequestBody NumeroDePolizaCliente numeroDePolizaCliente) {
        return numeroDePolizaClienteService.crearNumeroDePolizaCliente(numeroDePolizaCliente);
    }

    // Puedes agregar otros métodos en el controlador según tus necesidades
}

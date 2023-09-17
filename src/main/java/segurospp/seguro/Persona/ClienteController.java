package segurospp.seguro.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteServices clienteServices;

    @PostMapping()
    public void crearCliente(@RequestBody Cliente cliente) {
        clienteServices.crearCliente(cliente);
    }

}

package segurospp.seguro.Persona;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServices {

    private final ClienteRepository clienteRepo;

    public void crearCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

}

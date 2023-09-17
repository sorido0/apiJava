package segurospp.seguro.Persona;

import org.springframework.stereotype.Service;

@Service
public class NumeroDePolizaClienteService {

    private final NumeroDePolizaClienteRepository numeroDePolizaClienteRepository;

    public NumeroDePolizaClienteService(NumeroDePolizaClienteRepository numeroDePolizaClienteRepository) {
        this.numeroDePolizaClienteRepository = numeroDePolizaClienteRepository;
    }

    public NumeroDePolizaCliente crearNumeroDePolizaCliente(NumeroDePolizaCliente numeroDePolizaCliente) {
        return numeroDePolizaClienteRepository.save(numeroDePolizaCliente);
    }

    // Puedes agregar otros métodos según tus necesidades
}

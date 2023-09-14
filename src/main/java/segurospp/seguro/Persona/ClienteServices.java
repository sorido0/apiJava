package segurospp.seguro.Persona;

import java.util.List;
import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {
    private final ClienteRepository clienteRepository;

    // @Autowired
    public ClienteServices(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Métodos para la entidad Cliente
    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente actualizarCliente(Long id, Cliente clienteActualizado) {
        if (clienteRepository.existsById(id)) {
            clienteActualizado.setId(id);
            return clienteRepository.save(clienteActualizado);
        }
        return null; // Manejar el caso en el que el cliente no existe
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}

package segurospp.seguro.Persona;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
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
    private final PolizaServices polizaServices;

    // Obtenerr un Array de personas
    @GetMapping
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteServices.obtenerTodosLosClientes();
    }

    // Crear un cliente
    // @PostMapping
    // public void crearCliente(@RequestBody Cliente cliente) {
    // clienteServices.crearCliente(cliente);
    // }

    @PostMapping
    public void crearVehiculo(@RequestBody Cliente cliente) {
        Long polizaId = cliente.getPoliza().getId(); // Obtener el ID de la póliza desde el JSON
        Poliza poliza = polizaServices.obtenerPolizaPorId(polizaId); // Cargar la póliza desde la base de datos

        if (poliza != null) {
            cliente.setPoliza(poliza); // Asignar la póliza al vehículo
            clienteServices.crearCliente(cliente);
            // Guardar el vehículo

        } else {
            // La póliza no existe, devolver una respuesta de error 404 (No encontrado)

        }
    }

    // Obtener un cliente por id
    @GetMapping("/{id}")
    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteServices.obtenerClientePorId(id);
    }

}

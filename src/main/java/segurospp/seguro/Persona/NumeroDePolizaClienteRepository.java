package segurospp.seguro.Persona;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NumeroDePolizaClienteRepository extends JpaRepository<NumeroDePolizaCliente, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}

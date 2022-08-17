package EFAlanEscumpaniP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EFAlanEscumpaniP.Model.Cliente;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer> {

}

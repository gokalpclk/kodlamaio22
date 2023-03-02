package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gokalp on 2.03.2023
 * @project rentACar
 */
public interface ModelRepository extends JpaRepository<Model, Integer> {
}

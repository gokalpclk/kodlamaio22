package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Gokalp on 10/26/22
 */
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}

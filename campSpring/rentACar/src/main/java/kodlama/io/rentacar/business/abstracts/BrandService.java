package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 10/26/22
 */
@Service
public interface BrandService {
    List<Brand> getAll();

}

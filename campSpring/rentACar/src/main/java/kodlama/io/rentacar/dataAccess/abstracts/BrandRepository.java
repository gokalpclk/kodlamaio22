package kodlama.io.rentacar.dataAccess.abstracts;

import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

/**
 * @author Gokalp on 10/26/22
 */
public interface BrandRepository {
    List<Brand> getAll();


}

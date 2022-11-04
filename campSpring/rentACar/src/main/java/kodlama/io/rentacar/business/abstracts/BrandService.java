package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 10/26/22
 */
@Service
public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

}

package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.mappers.BrandMapper;
import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 10/26/22
 */

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brandList = brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponseList = BrandMapper.INSTANCE.convertToGetAllBrandsResponse(brandList);
        return  getAllBrandsResponseList;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = BrandMapper.INSTANCE.convertToBrand(createBrandRequest);
        brandRepository.save(brand);
    }
}

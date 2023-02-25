package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.requests.UpdateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.business.responses.GetByIdBrandResponse;
import kodlama.io.rentacar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Gokalp on 10/26/22
 */

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brandList = brandRepository.findAll();
        List<GetAllBrandsResponse> getAllBrandsResponseList =
                brandList.stream().map(brand -> this.modelMapperService.forResponse().map(
                        brand,
                        GetAllBrandsResponse.class
                )).collect(Collectors.toList());
        return getAllBrandsResponseList;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);

    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);

    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand= this.brandRepository.findById(id).orElseThrow();
        return this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
    }
}

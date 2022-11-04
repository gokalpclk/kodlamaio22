package kodlama.io.rentacar.business.mappers;

import kodlama.io.rentacar.business.requests.CreateBrandRequest;
import kodlama.io.rentacar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Gokalp on 11/4/22
 */
@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface BrandMapper {
    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    Brand convertToBrand(CreateBrandRequest createBrandRequest);

    List<GetAllBrandsResponse> convertToGetAllBrandsResponse(List<Brand> brandList);
}

package kodlama.io.rentacar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

/**
 * @author Gokalp on 25.02.2023
 * @project rentACar
 */
public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}

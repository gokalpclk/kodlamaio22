package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.business.requests.CreateModelRequest;
import kodlama.io.rentacar.business.responses.GetAllModelsResponse;

import java.util.List;

/**
 * @author Gokalp on 2.03.2023
 * @project rentACar
 */
public interface ModelService {
    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}

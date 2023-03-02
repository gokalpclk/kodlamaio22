package kodlama.io.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Gokalp on 2.03.2023
 * @project rentACar
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateModelRequest {
    @NotNull
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;

    @NotNull
    @NotBlank
    private int brandId;
}

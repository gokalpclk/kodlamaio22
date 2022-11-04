package kodlama.io.rentacar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gokalp on 11/4/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    private String name;
}

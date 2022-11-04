package kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gokalp on 11/4/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
    private int id;
    private String name;

}

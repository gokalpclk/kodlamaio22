package kodlama.io.rentacar.core.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Gokalp on 3.03.2023
 * @project rentACar
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProblemDetails {
    private String message;
}

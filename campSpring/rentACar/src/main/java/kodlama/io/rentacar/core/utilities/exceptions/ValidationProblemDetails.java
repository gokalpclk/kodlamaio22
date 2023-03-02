package kodlama.io.rentacar.core.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author Gokalp on 3.03.2023
 * @project rentACar
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationProblemDetails extends ProblemDetails{
    private Map<String, String > validationErrors;

}

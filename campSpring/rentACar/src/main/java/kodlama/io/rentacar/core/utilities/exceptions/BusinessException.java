package kodlama.io.rentacar.core.utilities.exceptions;

/**
 * @author Gokalp on 3.03.2023
 * @project rentACar
 */
public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}

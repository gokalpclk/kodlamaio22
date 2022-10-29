/**
 * @author Gokalp on 10/11/22
 */
public class ProductValidator {

    static {
        System.out.println("Static yapici blok-1");
    }
    static {
        System.out.println("Static yapici blok-2");
    }
    static {
        System.out.println("Static yapici blok-3");
    }

    public ProductValidator() {
        System.out.println("Yapici blok");
    }

    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey(){

    }


}

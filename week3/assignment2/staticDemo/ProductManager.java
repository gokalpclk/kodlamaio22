/**
 * @author Gokalp on 10/11/22
 */
public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        } else {
            System.out.println("Urun bilgileri gecersiz");
        }
    }
}

/**
 * @author Gokalp on 10/11/22
 */
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        productManager.add(product);
    }
}

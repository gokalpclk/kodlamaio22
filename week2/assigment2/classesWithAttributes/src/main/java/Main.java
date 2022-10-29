/**
 * @author Gokalp on 9/30/22
 */

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(2,"Laptop1","Asus Laptop1",500,5,"black");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());
        System.out.println(product1.getCode());

    }
}

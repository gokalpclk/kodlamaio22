/**
 * @author Gokalp on 9/22/22
 */
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("unknown1.jpg");

//        System.out.println(product1.name);
//        System.out.println(product1.unitPrice);
//        System.out.println(product1.discount);
//        System.out.println(product1.unitsInStock);
//        System.out.println(product1.imageUrl);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(4);
        product2.setImageUrl("unknown2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("unknown3.jpg");

        

        Product[] products = {product1, product3, product3};


        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Gokalp");
        individualCustomer.setLastName("Celik");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setCustomerNumber("12346");
        corporateCustomer.setCompanyName("Outplay Digital");
        corporateCustomer.setTaxNumber("11111111111111");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}

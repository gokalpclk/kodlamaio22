package dataAccess;

import entities.Product;

/**
 * @author Gokalp on 10/7/22
 */
public class JdbcProductDao implements ProductDao{

    @Override
    public void add(Product product){
        System.out.println("Product added with JDBC");
    }

}

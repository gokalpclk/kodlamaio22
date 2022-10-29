package business;

import core.logging.Logger;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;

import java.util.List;

/**
 * @author Gokalp on 10/7/22
 */
public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("The price of the product can be at least 10.");
        }
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}

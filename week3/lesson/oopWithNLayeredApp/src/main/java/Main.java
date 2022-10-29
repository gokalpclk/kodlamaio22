import business.ProductManager;
import core.logging.DattabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

import java.util.List;

/**
 * @author Gokalp on 10/7/22
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "IPHONE Xr", 10000);
        Logger[] loggers = {new DattabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product);

    }
}

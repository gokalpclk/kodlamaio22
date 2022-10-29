package dao.hibernate;

import dao.CategoryDao;
import entities.BaseAdditionalFields;
import entities.Category;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public class HibernateCategoryDao implements CategoryDao {


    @Override
    public Category add(BaseAdditionalFields entity) {
        System.out.println("Category added with Hibernate");
        return null;
    }

    @Override
    public List<Category> findAll() {
        System.out.println("All category Listed with Hibernate");
        return null;
    }

    @Override
    public void delete(BaseAdditionalFields entity) {
        System.out.println("All category deleted with Hibernate");
    }

}

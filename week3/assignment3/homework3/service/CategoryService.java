package service;

import dao.CategoryDao;
import entities.BaseAdditionalFields;
import entities.Category;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public class CategoryService extends BaseEntityService<Category, CategoryDao> {

    public CategoryService(CategoryDao dao) {
        super(dao);
    }

    public  Category add(Category category) {
        List<Category> categoryList = findAll();
        for (Category cat : categoryList) {
            if (cat.getName()==category.getName()){
                try {
                    throw new Exception("Category name cannot repeat");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Category added : " + category.getName());
        Category add = (Category) getDao().add(category);
        return category;
    }

}

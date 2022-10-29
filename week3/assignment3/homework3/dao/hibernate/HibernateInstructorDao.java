package dao.hibernate;

import dao.InstructorDao;
import entities.BaseAdditionalFields;
import entities.Category;
import entities.Instructor;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public class HibernateInstructorDao implements InstructorDao {

    @Override
    public Category add(BaseAdditionalFields entity) {
        System.out.println("Instructor added with Hibernate");
        return null;
    }

    @Override
    public List<Instructor> findAll() {
        System.out.println("All instructor listed with Hibernate");
        return null;
    }

    @Override
    public void delete(BaseAdditionalFields entity) {
        System.out.println("Instructor deleted with Hibernate");
    }

}

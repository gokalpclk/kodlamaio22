package dao.hibernate;

import dao.CourseDao;
import entities.BaseAdditionalFields;
import entities.Category;
import entities.Course;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public class HibernateCourseDao implements CourseDao {


    @Override
    public Category add(BaseAdditionalFields entity) {
        System.out.println("Course added with Hibernate");
        return null;
    }

    @Override
    public List<Course> findAll() {
        System.out.println("All courses Listed with Hibernate");
        return null;
    }

    @Override
    public void delete(BaseAdditionalFields entity) {
        System.out.println("Course deleted with Hibernate");
    }


}

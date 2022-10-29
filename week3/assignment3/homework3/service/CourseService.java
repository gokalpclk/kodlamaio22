package service;

import dao.CourseDao;
import entities.Course;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public class CourseService extends BaseEntityService<Course, CourseDao> {


    public CourseService(CourseDao dao) {
        super(dao);
    }

    public Course add(Course course) {
        List<Course> courseList = findAll();
        if(course.getPrice().compareTo(BigDecimal.ZERO)<0){
            try {
                throw new Exception("Course name cannot repeat");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        for (Course courseInstance : courseList) {
            if (courseInstance.getName() == course.getName()) {
                try {
                    throw new Exception("Course name cannot repeat");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        getDao().add(course);
        return course;
    }


}

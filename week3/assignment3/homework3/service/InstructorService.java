package service;

import dao.InstructorDao;
import entities.Course;
import entities.Instructor;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */public class InstructorService  extends BaseEntityService<Instructor, InstructorDao> {
    public InstructorService(InstructorDao dao) {
        super(dao);
    }

}

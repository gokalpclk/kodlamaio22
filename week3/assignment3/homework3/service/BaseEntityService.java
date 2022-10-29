package service;

import dao.BaseDao;
import dao.CourseDao;
import entities.BaseAdditionalFields;
import entities.Course;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public abstract class BaseEntityService <E extends BaseAdditionalFields, D extends BaseDao> {
    private D dao;

    public BaseEntityService(D dao) {
        this.dao = dao;
    }

    public List<E> findAll() {
        return dao.findAll();
    }
    public void delete(E entity) {
        dao.delete(entity);
    }
    public E add(E entity) {
        E add = (E) dao.add(entity);
        return add;
    }
    public D getDao() {
        return dao;
    }
}

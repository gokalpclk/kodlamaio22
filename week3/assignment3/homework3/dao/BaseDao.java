package dao;

import entities.BaseAdditionalFields;
import entities.Category;

import java.util.List;

/**
 * @author Gokalp on 10/11/22
 */
public interface BaseDao <E extends BaseAdditionalFields> {
    E add(E entity);

    List<E> findAll();

    void delete(E entity);
}

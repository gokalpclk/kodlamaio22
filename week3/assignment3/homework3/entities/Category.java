package entities;

import java.util.Date;

/**
 * @author Gokalp on 10/11/22
 */
public class Category extends BaseAdditionalFields{
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package kodlama.io.rentacar.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Gokalp on 10/26/22
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "brands")
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "brand")
    List<Model> models;

}

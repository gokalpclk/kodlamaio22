package kodlama.io.rentacar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Gokalp on 10/26/22
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "brands")
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

}

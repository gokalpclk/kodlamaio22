package kodlama.io.rentacar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Gokalp on 2.03.2023
 * @project rentACar
 */
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "plate", unique = true )
    private String plate;

    @Column(name = "dailyPrice")
    private BigDecimal dailyPrice;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "state")
    private int state;



    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}

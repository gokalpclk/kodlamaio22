package com.example.kodlamaiodevs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "programming_language")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programmingLanguage", targetEntity = Framework.class)
    private List<Framework> frameworkList;

}

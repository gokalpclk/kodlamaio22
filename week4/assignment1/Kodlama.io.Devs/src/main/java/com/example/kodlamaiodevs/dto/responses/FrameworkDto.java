package com.example.kodlamaiodevs.dto.responses;

import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import lombok.Data;

/**
 * @author Gokalp on 11/4/22
 */
@Data
public class FrameworkDto {
    private Long id;

    private String name;

    private String programmingLanguageName;

}

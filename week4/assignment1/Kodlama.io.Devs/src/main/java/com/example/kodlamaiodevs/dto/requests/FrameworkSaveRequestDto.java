package com.example.kodlamaiodevs.dto.requests;

import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import lombok.Data;

/**
 * @author Gokalp on 11/4/22
 */
@Data
public class FrameworkSaveRequestDto {
    private String name;

    private Long programmingLanguageId;
}

package com.example.kodlamaiodevs.dto.responses;

import lombok.Data;

import java.util.List;

/**
 * @author Gokalp on 11/4/22
 */
@Data
public class ProgrammingLanguageDto {
    private Long id;

    private String name;

    private List<FrameworkDtoListResponse> frameworkList;
}

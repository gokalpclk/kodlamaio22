package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
public interface ProgrammingLanguageService {
    ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    void deleteById(Long programmingLanguageId);
    ProgrammingLanguage update(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(Long id);
}

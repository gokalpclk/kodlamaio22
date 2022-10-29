package com.example.kodlamaiodevs.dataAccess.abstracts;

import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
public interface ProgrammingLanguageRepository {
    ProgrammingLanguage add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void deleteById(Long programmingLanguageId);
    ProgrammingLanguage update(ProgrammingLanguage programmingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(Long id);

}

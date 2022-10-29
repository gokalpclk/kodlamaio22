package com.example.kodlamaiodevs.dataAccess.concretes;

import com.example.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Gokalp on 10/28/22
 */
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguageList;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguageList = new ArrayList<>();
        programmingLanguageList.add(new ProgrammingLanguage(1L, "Java"));
        programmingLanguageList.add(new ProgrammingLanguage(2L, "C#"));
        programmingLanguageList.add(new ProgrammingLanguage(3L, "Python"));
        programmingLanguageList.add(new ProgrammingLanguage(4L, "JavaScript"));
        programmingLanguageList.add(new ProgrammingLanguage(5L, "PHP"));
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageList.add(programmingLanguage);
        return programmingLanguage;
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageList.remove(programmingLanguage);
    }

    @Override
    public void deleteById(Long programmingLanguageId) {
        ProgrammingLanguage programmingLanguage = getById(programmingLanguageId);
        programmingLanguageList.remove(programmingLanguage);
    }

    @Override
    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage update = getById(programmingLanguage.getId());
        if(update.getId() == programmingLanguage.getId()) {
            update.setName(programmingLanguage.getName());
        }
        return update;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageList;
    }

    @Override
    public ProgrammingLanguage getById(Long id) {
        for(ProgrammingLanguage programmingLanguage : programmingLanguageList) {
            if(programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }
}

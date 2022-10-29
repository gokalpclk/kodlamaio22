package com.example.kodlamaiodevs.business.concretes;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (checkNameExists(programmingLanguage) || checkIdExists(programmingLanguage) || !checkNameValidation(programmingLanguage)) {
            throw new Exception("Programming Language can not add");
        }else {
            return  programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) throws Exception {
        if(programmingLanguage.getId() == null) {
            throw new Exception("There is no programming language such as you have entered!");
        }
        programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public void deleteById(Long programmingLanguageId) {
        programmingLanguageRepository.deleteById(programmingLanguageId);
    }

    @Override
    public ProgrammingLanguage update(ProgrammingLanguage programmingLanguage) {
        return programmingLanguageRepository.update(programmingLanguage);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(Long id) {
        return programmingLanguageRepository.getById(id);
    }

    private boolean checkNameExists(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language: programmingLanguageRepository.getAll()) {
            if(programmingLanguage.getName().equals(language.getName())){
                return true;
            }
        }
        return false;
    }

    private boolean checkIdExists(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language: programmingLanguageRepository.getAll()) {
            if(programmingLanguage.getId().equals(language.getId())){
                return true;
            }
        }
        return false;
    }

    private boolean checkNameValidation(ProgrammingLanguage programmingLanguage) {
        String name = programmingLanguage.getName();
        if (name.isBlank() || name.isEmpty() || name.equals(null)){
            return false;
        }
        return true;
    }


}

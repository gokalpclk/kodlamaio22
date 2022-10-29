package com.example.kodlamaiodevs.webApi.controllers;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@RestController
@RequestMapping("/api/v1/programminglanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) {
        try {
            programmingLanguageService.add(programmingLanguage);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguage getById(@RequestParam Long id) {
        return programmingLanguageService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.delete(programmingLanguage);
    }

    @PostMapping("/deleteById")
    public void delete(@RequestParam Long id) {
        programmingLanguageService.deleteById(id);

    }

    @PostMapping("/update")
    public void update(@RequestBody ProgrammingLanguage language) {
        programmingLanguageService.update(language);
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }








}

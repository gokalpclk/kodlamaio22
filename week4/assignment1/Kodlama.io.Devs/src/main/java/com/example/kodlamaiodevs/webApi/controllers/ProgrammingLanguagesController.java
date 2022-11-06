package com.example.kodlamaiodevs.webApi.controllers;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.ProgrammingLanguageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@RestController
@RequestMapping("/api/v1/programminglanguages")
@RequiredArgsConstructor
public class ProgrammingLanguagesController {
    private final ProgrammingLanguageService programmingLanguageService;



    @PostMapping("/add")
    public ProgrammingLanguageDto add(@RequestBody ProgrammingLanguageSaveRequestDto programmingLanguageSaveRequestDto) {
         return programmingLanguageService.add(programmingLanguageSaveRequestDto);
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguageDto getById(@RequestParam Long id) {
        return programmingLanguageService.getById(id);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto) throws Exception {
        programmingLanguageService.delete(programmingLanguageUpdateAndDeleteRequestDto);
    }

    @PostMapping("/deleteById")
    public void delete(@RequestParam Long id) {
        programmingLanguageService.deleteById(id);

    }

    @PutMapping("/update")
    public ProgrammingLanguageDto update(@RequestBody ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto) {
        return programmingLanguageService.update(programmingLanguageUpdateAndDeleteRequestDto);
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguageDto> getAll(){
        return programmingLanguageService.getAll();
    }








}

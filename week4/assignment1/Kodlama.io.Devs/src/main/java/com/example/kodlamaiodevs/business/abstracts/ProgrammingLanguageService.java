package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.ProgrammingLanguageDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@Service
public interface ProgrammingLanguageService {
    ProgrammingLanguageDto add(ProgrammingLanguageSaveRequestDto programmingLanguageSaveRequestDto);
    void delete(ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto) throws Exception;
    void deleteById(Long programmingLanguageId);
    ProgrammingLanguageDto update(ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto);
    List<ProgrammingLanguageDto> getAll();
    ProgrammingLanguageDto getById(Long ProgrammingLanguageId);
}

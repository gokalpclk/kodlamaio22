package com.example.kodlamaiodevs.business.concretes;

import com.example.kodlamaiodevs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlamaiodevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlamaiodevs.dto.converters.ProgrammingLanguageMapper;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.ProgrammingLanguageDto;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Gokalp on 10/28/22
 */
@Service
@RequiredArgsConstructor
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;


    @Override
    public ProgrammingLanguageDto add(ProgrammingLanguageSaveRequestDto programmingLanguageSaveRequestDto)  {
        ProgrammingLanguage programmingLanguage = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguage(programmingLanguageSaveRequestDto);
        //Todo: Logic error
        //if (checkNameExists(programmingLanguage) || checkIdExists(programmingLanguage) || !checkNameValidation(programmingLanguage)) {
        //    throw new Exception("Programming Language can not add");
        //}else {
        programmingLanguage = programmingLanguageRepository.save(programmingLanguage);
        ProgrammingLanguageDto programmingLanguageDto = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguageDto(programmingLanguage);
        return programmingLanguageDto;
        //}
    }

    @Override
    public void delete(ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto) throws Exception {
        if (programmingLanguageUpdateAndDeleteRequestDto.getId() == null) {
            throw new Exception("There is no programming language such as you have entered!");
        }
        ProgrammingLanguage programmingLanguage = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguage(programmingLanguageUpdateAndDeleteRequestDto);
        programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public void deleteById(Long programmingLanguageId) {
        programmingLanguageRepository.deleteById(programmingLanguageId);
    }

    @Override
    public ProgrammingLanguageDto update(ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto) {

        ProgrammingLanguage programmingLanguage = null;
        try {
            programmingLanguage = getByIdWithControl(programmingLanguageUpdateAndDeleteRequestDto.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        programmingLanguage.setName(programmingLanguageUpdateAndDeleteRequestDto.getName());
        programmingLanguage = programmingLanguageRepository.save(programmingLanguage);
        ProgrammingLanguageDto programmingLanguageDto = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguageDto(programmingLanguage);
        return programmingLanguageDto;
    }

    @Override
    public List<ProgrammingLanguageDto> getAll() {
        List<ProgrammingLanguage> programmingLanguageList = programmingLanguageRepository.findAll();
        List<ProgrammingLanguageDto> programmingLanguageDtoList = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguageDtoList(programmingLanguageList);
        return programmingLanguageDtoList;
    }

    @Override
    public ProgrammingLanguageDto getById(Long id) {
        ProgrammingLanguage programmingLanguage;
        try {
            programmingLanguage = getByIdWithControl(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ProgrammingLanguageDto programmingLanguageDto = ProgrammingLanguageMapper.INSTANCE.convertToProgrammingLanguageDto(programmingLanguage);
        return programmingLanguageDto;


    }

    private boolean checkNameExists(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
            if (programmingLanguage.getName().equals(language.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkIdExists(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : programmingLanguageRepository.findAll()) {
            if (programmingLanguage.getId().equals(language.getId())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkNameValidation(ProgrammingLanguage programmingLanguage) {
        String name = programmingLanguage.getName();
        if (name.isBlank() || name.isEmpty() || name.equals(null)) {
            return false;
        }
        return true;
    }

    public ProgrammingLanguage getByIdWithControl(Long id) throws Exception {
        Optional<ProgrammingLanguage> entityOptional = findById(id);

        ProgrammingLanguage entity;

        if (entityOptional.isPresent()) {
            entity = entityOptional.get();
        } else {
            throw new Exception("ITEM NOT FOUND");
        }

        return entity;
    }

    public Optional<ProgrammingLanguage> findById(Long id) {
        return programmingLanguageRepository.findById(id);
    }


}

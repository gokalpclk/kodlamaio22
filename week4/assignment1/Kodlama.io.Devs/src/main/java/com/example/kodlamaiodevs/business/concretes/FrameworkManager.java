package com.example.kodlamaiodevs.business.concretes;

import com.example.kodlamaiodevs.business.abstracts.FrameworkService;
import com.example.kodlamaiodevs.dataAccess.abstracts.FrameworkRepository;
import com.example.kodlamaiodevs.dto.converters.FrameworkMapper;
import com.example.kodlamaiodevs.dto.requests.FrameworkSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.FrameworkUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.FrameworkDto;
import com.example.kodlamaiodevs.entities.concretes.Framework;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Gokalp on 11/5/22
 */
@Service
@RequiredArgsConstructor
public class FrameworkManager implements FrameworkService {
    private final FrameworkRepository frameworkRepository;
    private final ProgrammingLanguageManager programmingLanguageManager;

    @Override
    public FrameworkDto add(FrameworkSaveRequestDto frameworkSaveRequestDto) {
        ProgrammingLanguage programmingLanguage = null;
        try {
            programmingLanguage = programmingLanguageManager.getByIdWithControl(frameworkSaveRequestDto.getProgrammingLanguageId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Framework framework = FrameworkMapper.INSTANCE.convertToFramework(frameworkSaveRequestDto);
        framework.setProgrammingLanguage(programmingLanguage);
        framework = frameworkRepository.save(framework);
        FrameworkDto frameworkDto = FrameworkMapper.INSTANCE.convertToFrameworkDto(framework);
        return frameworkDto;

    }

    @Override
    public void delete(FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto) throws Exception {
        FrameworkMapper.INSTANCE.convertToFramework(frameworkUpdateAndDeleteRequestDto);
    }

    @Override
    public void deleteById(Long frameworkId) {
        frameworkRepository.deleteById(frameworkId);

    }

    @Override
    public FrameworkDto update(FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto) {
        Framework framework = null;
        try {
            framework = getByIdWithControl(frameworkUpdateAndDeleteRequestDto.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //Framework framework = FrameworkMapper.INSTANCE.convertToFramework(frameworkUpdateAndDeleteRequestDto);
        framework.setName(frameworkUpdateAndDeleteRequestDto.getName());
        framework = frameworkRepository.save(framework);
        FrameworkDto frameworkDto = FrameworkMapper.INSTANCE.convertToFrameworkDto(framework);
        return frameworkDto;
    }

    @Override
    public List<FrameworkDto> getAll() {
        List<Framework> frameworkList = frameworkRepository.findAll();
        List<FrameworkDto> frameworkDtoList = FrameworkMapper.INSTANCE.convertToFrameworkDtoList(frameworkList);
        return frameworkDtoList;
    }

    @Override
    public FrameworkDto getById(Long frameworkId) {
        Framework framework;
        try {
            framework = getByIdWithControl(frameworkId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        FrameworkDto frameworkDto = FrameworkMapper.INSTANCE.convertToFrameworkDto(framework);
        return frameworkDto;
    }

    public Framework getByIdWithControl(Long id) throws Exception {
        Optional<Framework> entityOptional = findById(id);

        Framework entity;

        if (entityOptional.isPresent()) {
            entity = entityOptional.get();
        } else {
            throw new Exception("ITEM NOT FOUND");
        }

        return entity;
    }

    public Optional<Framework> findById(Long id) {
        return frameworkRepository.findById(id);
    }
}

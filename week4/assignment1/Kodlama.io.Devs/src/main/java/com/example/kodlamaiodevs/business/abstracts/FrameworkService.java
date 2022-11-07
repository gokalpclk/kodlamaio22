package com.example.kodlamaiodevs.business.abstracts;

import com.example.kodlamaiodevs.dto.requests.FrameworkSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.FrameworkUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.FrameworkDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gokalp on 11/4/22
 */
@Service
public interface FrameworkService {
    FrameworkDto add(FrameworkSaveRequestDto frameworkSaveRequestDto);
    void delete(FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto) throws Exception;

    void deleteById(Long frameworkId);
    FrameworkDto update(FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto);
    List<FrameworkDto> getAll();
    FrameworkDto getById(Long frameworkId);
}

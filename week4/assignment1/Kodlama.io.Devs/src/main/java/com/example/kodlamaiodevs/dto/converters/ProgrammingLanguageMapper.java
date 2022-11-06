package com.example.kodlamaiodevs.dto.converters;

import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.ProgrammingLanguageUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.ProgrammingLanguageDto;
import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Gokalp on 11/4/22
 */
@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProgrammingLanguageMapper {
    ProgrammingLanguageMapper INSTANCE = Mappers.getMapper(ProgrammingLanguageMapper.class);

    ProgrammingLanguage convertToProgrammingLanguage(ProgrammingLanguageSaveRequestDto programmingLanguageSaveRequestDto);


    ProgrammingLanguageDto convertToProgrammingLanguageDto(ProgrammingLanguage programmingLanguage);


    ProgrammingLanguage convertToProgrammingLanguage(ProgrammingLanguageDto programmingLanguageDto);
    ProgrammingLanguage convertToProgrammingLanguage(ProgrammingLanguageUpdateAndDeleteRequestDto programmingLanguageUpdateAndDeleteRequestDto);
    List<ProgrammingLanguageDto> convertToProgrammingLanguageDtoList(List<ProgrammingLanguage> programmingLanguageList);
}

package com.example.kodlamaiodevs.dto.converters;

import com.example.kodlamaiodevs.dto.requests.FrameworkSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.FrameworkUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.FrameworkDto;
import com.example.kodlamaiodevs.entities.concretes.Framework;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Gokalp on 11/4/22
 */
@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FrameworkMapper {
    FrameworkMapper INSTANCE = Mappers.getMapper(FrameworkMapper.class);

    Framework convertToFramework(FrameworkSaveRequestDto frameworkSaveRequestDto);
    Framework convertToFramework(FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto);

    @Mapping(target = "programmingLanguageName", source = "programmingLanguage.name")
    FrameworkDto convertToFrameworkDto(Framework framework);
    List<FrameworkDto> convertToFrameworkDtoList(List<Framework> framework);



}

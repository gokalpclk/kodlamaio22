package com.example.kodlamaiodevs.webApi.controllers;

import com.example.kodlamaiodevs.business.abstracts.FrameworkService;
import com.example.kodlamaiodevs.dto.requests.FrameworkSaveRequestDto;
import com.example.kodlamaiodevs.dto.requests.FrameworkUpdateAndDeleteRequestDto;
import com.example.kodlamaiodevs.dto.responses.FrameworkDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@RestController
@RequestMapping("/api/v1/frameworks")
@RequiredArgsConstructor
public class FrameworkController {
    private final FrameworkService frameworkService;


    @PostMapping("/add")
    public FrameworkDto add(@RequestBody FrameworkSaveRequestDto frameworkSaveRequestDto) {
        FrameworkDto frameworkDto;
        try {
            frameworkDto = frameworkService.add(frameworkSaveRequestDto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return frameworkDto;
    }

    @GetMapping("/{id}")
    public FrameworkDto getById(@PathVariable Long id) {
        return frameworkService.getById(id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto) throws Exception {
        frameworkService.delete(frameworkUpdateAndDeleteRequestDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        frameworkService.deleteById(id);
    }

    @PutMapping("/update")
    public FrameworkDto update(@RequestBody FrameworkUpdateAndDeleteRequestDto frameworkUpdateAndDeleteRequestDto) {
        return  frameworkService.update(frameworkUpdateAndDeleteRequestDto);
    }

    @GetMapping("/getall")
    public List<FrameworkDto> getAll(){
        return frameworkService.getAll();
    }








}

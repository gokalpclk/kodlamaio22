package com.example.kodlamaiodevs.dataAccess.abstracts;

import com.example.kodlamaiodevs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Gokalp on 10/28/22
 */
@Repository
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {

}

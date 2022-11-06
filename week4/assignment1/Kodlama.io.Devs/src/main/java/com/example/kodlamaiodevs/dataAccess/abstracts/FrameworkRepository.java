package com.example.kodlamaiodevs.dataAccess.abstracts;

import com.example.kodlamaiodevs.entities.concretes.Framework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Gokalp on 11/4/22
 */
@Repository
public interface FrameworkRepository extends JpaRepository<Framework, Long> {
}

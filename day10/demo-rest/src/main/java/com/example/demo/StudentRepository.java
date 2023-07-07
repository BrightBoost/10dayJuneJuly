package com.example.demo;

import com.example.demo.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findAll();

    Optional<Student> findByName(String name);
    List<Student> findByCountry(String country);

    List<Student> findByMajor(String major);

    List<Student> findByMentor(String mentor);
}

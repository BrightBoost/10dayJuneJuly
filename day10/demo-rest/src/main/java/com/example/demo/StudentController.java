package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById(@PathVariable Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // The following endpoint is based on the assumption that a 'findByName' method exists in your StudentRepository

    @GetMapping("/name/{name}")
    public ResponseEntity<Student> getByName(@PathVariable String name) {
        Optional<Student> studentOptional = studentRepository.findByName(name);
        return studentOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/major/{major}")
    public ResponseEntity<List<Student>> getByMajor(@PathVariable String major) {
        List<Student> students = studentRepository.findByMajor(major);
        if(students.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<Student>> getByCountry(@PathVariable String country) {
        List<Student> students = studentRepository.findByCountry(country);
        if(students.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(students);
    }

    // The following POST method is based on the assumption that a 'findByName' method exists in your StudentRepository

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        if(studentRepository.findByName(student.getName()).isPresent()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Student savedStudent = studentRepository.save(student);
        return ResponseEntity.created(URI.create("/students/" + savedStudent.getId())).body(savedStudent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateById(@PathVariable Long id, @RequestBody Student student) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        Student existingStudent = studentOptional.get();
        if(student.getName() != null){
            existingStudent.setName(student.getName());
        }
        if(student.getMajor() != null){
            existingStudent.setMajor(student.getMajor());
        }
        if(student.getMentor() != null){
            existingStudent.setMentor(student.getMentor());
        }
        if(student.getCountry() != null){
            existingStudent.setCountry(student.getCountry());
        }
        studentRepository.save(existingStudent);
        return ResponseEntity.ok(existingStudent);
    }

    @PutMapping("/{id}/country")
    public ResponseEntity<Student> updateCountry(@PathVariable Long id, @RequestBody String country) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        Student existingStudent = studentOptional.get();
        existingStudent.setCountry(country);
        studentRepository.save(existingStudent);
        return ResponseEntity.ok(existingStudent);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if(!studentRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        studentRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/mentor/{mentor}")
    public ResponseEntity<List<Student>> getByMentor(@PathVariable String mentor) {
        List<Student> students = studentRepository.findByMentor(mentor);
        if(students.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(students);
    }

    @PutMapping("/{id}/mentor")
    public ResponseEntity<Student> updateMentor(@PathVariable Long id, @RequestBody String mentor) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(!studentOptional.isPresent()){
            return ResponseEntity.notFound().build();
        }

        Student existingStudent = studentOptional.get();
        existingStudent.setMentor(mentor);
        studentRepository.save(existingStudent);
        return ResponseEntity.ok(existingStudent);
    }
}

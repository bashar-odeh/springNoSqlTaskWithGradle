package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface StudentRepository
        extends MongoRepository<Student,String> {

    Optional<Student> findByEmail(String email  );
    void deleteStudentByEmail(String email);
}

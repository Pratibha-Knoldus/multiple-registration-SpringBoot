package com.example.multiple.registration.Repository;

import com.example.multiple.registration.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Student repository.
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Override
    List<Student> findAll();
}


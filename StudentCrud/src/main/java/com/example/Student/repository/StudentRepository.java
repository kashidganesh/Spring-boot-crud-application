package com.example.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

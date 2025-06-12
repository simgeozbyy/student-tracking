package com.example.student_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_tracking.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

package com.example.student_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_tracking.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}

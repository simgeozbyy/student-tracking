package com.example.student_tracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student_tracking.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

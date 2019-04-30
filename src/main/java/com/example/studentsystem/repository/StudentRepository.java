package com.example.studentsystem.repository;

import com.example.studentsystem.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface StudentRepository extends JpaRepository<StudentProfile, Long> {
}

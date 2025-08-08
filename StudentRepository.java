package com.example.student.management.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.management.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}

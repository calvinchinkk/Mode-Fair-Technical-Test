package com.example.schooltest.Repositories;

import com.example.schooltest.Dao.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

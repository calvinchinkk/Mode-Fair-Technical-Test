package com.example.schooltest.Repositories;

import com.example.schooltest.Dao.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

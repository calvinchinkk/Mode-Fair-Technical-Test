package com.example.schooltest.Repositories;

import java.util.List;

import com.example.schooltest.Dao.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    @Query("Select DISTINCT l.name AS lname, c.name AS cname from Lecturer l join Schedule s on l.id=s.lecturer join Course c on s.course = c.id")
    public List<Object> findAllDistinctData();
}

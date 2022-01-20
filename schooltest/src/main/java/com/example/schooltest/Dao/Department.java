package com.example.schooltest.Dao;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Course> course;

    @OneToMany(mappedBy = "department")
    private List<Lecturer> lecturer;

    public Department() {
    }

    public Department(Long id, String name, List<Course> course, List<Lecturer> lecturer) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.lecturer = lecturer;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return this.course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public List<Lecturer> getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(List<Lecturer> lecturer) {
        this.lecturer = lecturer;
    }
}

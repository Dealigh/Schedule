package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Student;

import java.util.List;

public interface StudendService {

    Student getStudent (Long id);

    void delete(Long id);

    void update(Long id, Student u);

    void create(Student u);

    List<Student> getAllStudents();
}

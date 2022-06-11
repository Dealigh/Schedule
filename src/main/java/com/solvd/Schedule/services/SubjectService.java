package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Subject;

import java.util.List;

public interface SubjectService {

    Subject getSubject (Long id);

    void delete(Long id);

    void update(Long id, Subject u);

    void create(Subject u);

    List<Subject> getAllSubjects();

}

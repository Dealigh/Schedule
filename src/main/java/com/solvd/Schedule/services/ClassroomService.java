package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Classroom;

import java.util.List;

public interface ClassroomService {

    Classroom getClassroom (Long id);

    void delete(Long id);

    void update(Long id, Classroom u);

    void create(Classroom u);

    List<Classroom> getAllClassrooms();

}

package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Classroom;

import java.util.List;

public interface ClassroomService {

    Classroom getClassroom (long id);

    void delete(long id);

    void update(long id, Classroom u);

    void create(Classroom u);

    List<Classroom> getAllClassrooms();

}

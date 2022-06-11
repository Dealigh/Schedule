package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.binary.Classroom;
import com.solvd.Schedule.dao.IClassroomDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public class ClassroomDAO extends AbstractConnection implements IClassroomDAO {

    @Override
    public Classroom getEntity(Long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Classroom entity) throws ExceptionDAO {

    }

    @Override
    public void update(Long id, Classroom entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Long id) throws ExceptionDAO {

    }

    @Override
    public List<Classroom> getAll() throws ExceptionDAO {
        return null;
    }
}

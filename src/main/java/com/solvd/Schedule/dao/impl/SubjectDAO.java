package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.binary.Subject;
import com.solvd.Schedule.dao.ISubjectDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public class SubjectDAO extends AbstractConnection implements ISubjectDAO {

    @Override
    public Subject getEntity(Long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Subject entity) throws ExceptionDAO {

    }

    @Override
    public void update(Long id, Subject entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Long id) throws ExceptionDAO {

    }

    @Override
    public List<Subject> getAll() throws ExceptionDAO {
        return null;
    }
}

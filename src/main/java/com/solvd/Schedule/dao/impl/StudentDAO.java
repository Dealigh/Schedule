package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.binary.Student;
import com.solvd.Schedule.dao.IStudentDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public class StudentDAO extends AbstractConnection implements IStudentDAO {

    @Override
    public Student getEntity(Long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Student entity) throws ExceptionDAO {

    }

    @Override
    public void update(Long id, Student entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Long id) throws ExceptionDAO {

    }

    @Override
    public List<Student> getAll() throws ExceptionDAO {
        return null;
    }
}

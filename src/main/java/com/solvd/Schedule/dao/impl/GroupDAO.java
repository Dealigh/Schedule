package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.dao.IGroupDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public class GroupDAO extends AbstractConnection implements IGroupDAO {
    @Override
    public Object getEntity(Object id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Object entity) throws ExceptionDAO {

    }

    @Override
    public void update(Object id, Object entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Object id) throws ExceptionDAO {

    }

    @Override
    public List getAll() throws ExceptionDAO {
        return null;
    }
}

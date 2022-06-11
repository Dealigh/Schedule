package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.dao.IModuleDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public class ModuleDAO extends AbstractConnection implements IModuleDAO {

    @Override
    public Module getEntity(Long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Module entity) throws ExceptionDAO {

    }

    @Override
    public void update(Long id, Module entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Long id) throws ExceptionDAO {

    }

    @Override
    public List<Module> getAll() throws ExceptionDAO {
        return null;
    }
}

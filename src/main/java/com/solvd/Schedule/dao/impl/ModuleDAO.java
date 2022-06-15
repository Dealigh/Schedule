package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.dao.IModuleDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ModuleDAO extends AbstractConnection implements IModuleDAO {

    private final String GET_ONE = "SELECT * from modules WHERE idModule=?";
    private final String GET_ALL = "SELECT subjectsId, classroomsId, shiftsId FROM modules";

    private static final Logger LOG = LogManager.getLogger(ModuleDAO.class);


    @Override
    public void saveEntity(Module entity) throws ExceptionDAO {

    }

    @Override
    public void update(long id, Module entity) throws ExceptionDAO {

    }

    @Override
    public void delete(long id) throws ExceptionDAO {

    }

    @Override
    public Module getEntity(long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public List<Module> getAll() throws ExceptionDAO {
        return null;
    }

}

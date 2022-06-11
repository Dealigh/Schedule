package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.binary.Group;
import com.solvd.Schedule.dao.IGroupDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GroupDAO extends AbstractConnection implements IGroupDAO {
    private final String INSERT = "INSERT INTO Group (limitAmount, shiftsId) VALUES (?,?)";
    private final String UPDATE = "UPDATE Group SET limitAmount =?, shiftsId= ? WHERE idGroup=?";
    private final String DELETE = "DELETE from Group WHERE idGroup=?";
    private final String GET_ONE = "SELECT idGroup, limitAmount, shiftsId from Group WHERE idGroup=?";
    private final String GET_ALL = "SELECT idGroup, limitAmount, shiftsId FROM Group";

    private static final Logger LOG = LogManager.getLogger(GroupDAO.class);


    @Override
    public Group getEntity(Long id) throws ExceptionDAO {
        return null;
    }

    @Override
    public void saveEntity(Group entity) throws ExceptionDAO {

    }

    @Override
    public void update(Long id, Group entity) throws ExceptionDAO {

    }

    @Override
    public void delete(Long id) throws ExceptionDAO {

    }

    @Override
    public List<Group> getAll() throws ExceptionDAO {
        return null;
    }
}

package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.binary.Shifts;
import com.solvd.Schedule.dao.IShiftsDAO;
import com.solvd.Schedule.util.exceptions.ExceptionDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ShiftsDAO extends AbstractConnection implements IShiftsDAO {

    private final String GET_ONE = "SELECT idShifts, name from shifts WHERE idShifts=?";

    private static final Logger LOG = LogManager.getLogger(ShiftsDAO.class);

    private Shifts convert(ResultSet rs) throws SQLException {
        String name = rs.getString("name");
        Shifts shift = new Shifts(name);
        shift.setId(rs.getLong("idShifts"));
        return shift;
    }

    @Override
    public Shifts getEntity(Long id) throws ExceptionDAO {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = getConnect();
        Shifts shift;
        try {
            ps = conn.prepareStatement(GET_ONE);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                shift = convert(rs);
            } else {
                throw new ExceptionDAO("Did not work");
            }
        } catch (SQLException e) {
            LOG.error("Error in SQL", e);
            throw new ExceptionDAO("Can't reach the Shift");
        } finally {
            returnConnect(conn);
            closeResources(ps, rs);
        }
        return shift;
    }

    @Override
    public List<Shifts> getAll() throws ExceptionDAO {
        throw new UnsupportedOperationException("No implementation yet");
    }

    @Override
    public void saveEntity(Shifts entity) throws ExceptionDAO {
        throw new UnsupportedOperationException("No implementation yet");
    }

    @Override
    public void update(Long id, Shifts entity) throws ExceptionDAO {
        throw new UnsupportedOperationException("No implementation yet");
    }

    @Override
    public void delete(Long id) throws ExceptionDAO {
        throw new UnsupportedOperationException("No implementation yet");
    }


}

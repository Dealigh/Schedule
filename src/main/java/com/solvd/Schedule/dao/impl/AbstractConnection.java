package com.solvd.Schedule.dao.impl;

<<<<<<< HEAD
import com.solvd.Schedule.util.ConnectionPool.ConnectionPool;
=======
>>>>>>> 988a06e318ac927c95a6af8e1a2a8ba1fec3ae8d
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractConnection {

    private final static Logger LOG = LogManager.getLogger(AbstractConnection.class);

    public Connection getConnect() {
        return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnect(Connection conn) {
        ConnectionPool.getInstance().returnConnection(conn);
    }

    public static void closeResources(PreparedStatement pr, ResultSet rs) {
        try {
            if (pr != null) {
                pr.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            LOG.error("ERROR: Could not close resources properly", e);
            throw new RuntimeException(e);
        }
    }

    public static void closeResources(PreparedStatement pr) {
        try {
            if (pr != null) {
                pr.close();
            }
        } catch (SQLException e) {
            LOG.error("ERROR: Could not close resources properly", e);
        }
    }
}

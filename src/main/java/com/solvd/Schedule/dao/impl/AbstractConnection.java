package com.solvd.Schedule.dao.impl;

import com.solvd.Schedule.util.ConnectionPool;

import java.sql.Connection;

public abstract class AbstractConnection {

    public Connection getConnect() {
        return ConnectionPool.getInstance().getConnection();
    }

    public void returnConnect(Connection conn) {
        ConnectionPool.getInstance().returnConnection(conn);
    }
}

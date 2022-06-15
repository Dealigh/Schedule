package com.solvd.Schedule.dao;

import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public interface ManagerDAO <T> {

    T getEntity(long id) throws ExceptionDAO;

    void saveEntity(T entity) throws ExceptionDAO;

    void update(long id, T entity) throws ExceptionDAO;

    void delete(long id) throws ExceptionDAO;

    List<T> getAll() throws ExceptionDAO;

}

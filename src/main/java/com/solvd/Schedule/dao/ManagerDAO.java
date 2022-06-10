package com.solvd.Schedule.dao;

import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public interface ManagerDAO <T, K> {

    T getEntity(K id) throws ExceptionDAO;

    void saveEntity(T entity) throws ExceptionDAO;

    void update(K id, T entity) throws ExceptionDAO;

    void delete(K id) throws ExceptionDAO;

    List<T> getAll() throws ExceptionDAO;

}

package com.solvd.Schedule.dao;

import com.solvd.Schedule.util.exceptions.ExceptionDAO;

import java.util.List;

public interface ManagerDAO <T> {

    T getEntity(Long id) throws ExceptionDAO;

    void saveEntity(T entity) throws ExceptionDAO;

    void update(Long id, T entity) throws ExceptionDAO;

    void delete(Long id) throws ExceptionDAO;

    List<T> getAll() throws ExceptionDAO;

}

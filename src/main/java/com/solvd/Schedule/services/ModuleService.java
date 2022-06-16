package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Module;

import java.util.List;

public interface ModuleService {

    Module getModule (long id);

    void delete(long id);

    void update(long id, Module u);

    void create(Module u);

    List<Module> getAllModules();
}

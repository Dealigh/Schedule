package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Module;

import java.util.List;

public interface ModuleService {

    Module getModule (Long id);

    void delete(Long id);

    void update(Long id, Module u);

    void create(Module u);

    List<Module> getAllModules();
}

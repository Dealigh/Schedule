package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Group;

import java.util.List;

public interface GroupService {

    Group getGroup (Long id);

    void delete(Long id);

    void update(Long id, Group u);

    void create(Group u);

    List<Group> getAllGroups();

}

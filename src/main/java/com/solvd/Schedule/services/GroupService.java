package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Group;

import java.util.List;

public interface GroupService {

    Group getGroup (long id);

    void delete(long id);

    void update(long id, Group u);

    void create(Group u);

    List<Group> getAllGroups();

}

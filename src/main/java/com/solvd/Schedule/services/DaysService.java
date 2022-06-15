package com.solvd.Schedule.services;

import com.solvd.Schedule.binary.Days;

import java.util.List;

public interface DaysService {

    Days getDays (Long id);

    void update(Long id, Days u);

    List<Days> getAllDays();

}

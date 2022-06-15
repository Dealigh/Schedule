package com.solvd.Schedule.services.jdbcImplem;

import com.solvd.Schedule.binary.Days;
import com.solvd.Schedule.dao.IDaysDAO;
import com.solvd.Schedule.dao.impl.DaysDAO;
import com.solvd.Schedule.services.DaysService;

import java.util.List;

public class DaysServiceImpl implements DaysService {
    @Override
    public Days getDays(long id) {
        IDaysDAO day = new DaysDAO();
        return day.getEntity(id);
    }

    @Override
    public void update(long id, Days u) {
        IDaysDAO days = new DaysDAO();
        days.update(id, u);
    }

    @Override
    public List<Days> getAllDays() {
        IDaysDAO listDays = new DaysDAO();
        return listDays.getAll();
    }

}

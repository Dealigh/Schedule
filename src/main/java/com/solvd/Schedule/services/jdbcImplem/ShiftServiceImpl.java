package com.solvd.Schedule.services.jdbcImplem;

import com.solvd.Schedule.binary.Shifts;
import com.solvd.Schedule.dao.IDaysDAO;
import com.solvd.Schedule.dao.IShiftsDAO;
import com.solvd.Schedule.dao.impl.DaysDAO;
import com.solvd.Schedule.dao.impl.ShiftsDAO;
import com.solvd.Schedule.services.ShiftService;

import java.util.List;

public class ShiftServiceImpl implements ShiftService {

    @Override
    public Shifts getShift(long id) {
        IShiftsDAO shift = new ShiftsDAO();
        DaysDAO days = new DaysDAO();
        Shifts returnShift = shift.getEntity(id);
        returnShift.setDays(days.getAllbyShiftId(id));
        return returnShift;
    }

    @Override
    public List<Shifts> getAllShiftsbyName(String name) {
        IShiftsDAO shift = new ShiftsDAO();
        return ((ShiftsDAO) shift).getAllShiftsbyName(name);
    }
}

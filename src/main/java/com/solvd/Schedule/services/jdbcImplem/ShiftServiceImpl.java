package com.solvd.Schedule.services.jdbcImplem;

import com.solvd.Schedule.binary.Shifts;
import com.solvd.Schedule.dao.IShiftsDAO;
import com.solvd.Schedule.dao.impl.ShiftsDAO;
import com.solvd.Schedule.services.ShiftService;

public class ShiftServiceImpl implements ShiftService {
    @Override
    public Shifts getShift(Long id) {
        IShiftsDAO shift = new ShiftsDAO();
        return shift.getEntity(id);
    }
}

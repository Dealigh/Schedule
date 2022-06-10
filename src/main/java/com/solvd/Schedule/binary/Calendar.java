package com.solvd.Schedule.binary;

import java.util.List;

public class Calendar {
    private long id;
    private List<Shift> shifts;

    public Calendar(long id, List<Shift> shifts) {
        this.id = id;
        this.shifts = shifts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }
}

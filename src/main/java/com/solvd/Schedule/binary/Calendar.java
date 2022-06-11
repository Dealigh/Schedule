package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

public class Calendar {
    private Long id;
    private List<Shift> shifts;

    public Calendar(Long id, List<Shift> shifts) {
        this.id = id;
        this.shifts = shifts;
    }

    public Calendar(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendar)) return false;
        Calendar calendar = (Calendar) o;
        return id == calendar.id && Objects.equals(shifts, calendar.shifts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shifts);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "id=" + id +
                ", shifts=" + shifts +
                '}';
    }
}

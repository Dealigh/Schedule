package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

public class Group {
    private Long id;
    private final static int limitAmount = 10;
    private int shiftId;

    public Group( int shiftId) {
        this.shiftId = shiftId;
    }

    public Group(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getShiftId() {
        return shiftId;
    }

    public void setShiftId(int shiftId) {
        this.shiftId = shiftId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return shiftId == group.shiftId && Objects.equals(id, group.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, shiftId);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", shiftId=" + shiftId +
                '}';
    }
}

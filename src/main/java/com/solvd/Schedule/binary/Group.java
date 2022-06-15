package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

public class Group {
    private long id;
    private List<Student> students;
    private int limitAmount;
    private Shift shift;

    public Group(long id, char groupLetter, List<Student> students, Shift shift) {
        this.id = id;
        this.students = students;
        this.shift = shift;
    }

    public Group(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(int limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", students=" + students +
                ", shift=" + shift +
                '}';
    }
}

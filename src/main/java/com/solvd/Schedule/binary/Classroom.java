package com.solvd.Schedule.binary;

import java.util.Objects;

public class Classroom {
    private long id;
    private int classroomNumber;
    private boolean available;

    public Classroom(long id, int classroomNumber, boolean available) {
        this.id = id;
        this.classroomNumber = classroomNumber;
        this.available = available;
    }

    public Classroom(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return id == classroom.id && classroomNumber == classroom.classroomNumber && available == classroom.available;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classroomNumber, available);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", classroomNumber=" + classroomNumber +
                ", available=" + available +
                '}';
    }
}
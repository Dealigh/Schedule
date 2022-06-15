package com.solvd.Schedule.binary;

import java.util.Objects;

public class Classroom {
    private long id;
    private int classroomNumber;
    private int size;
    private boolean available;

    public Classroom(int classroomNumber, int size, boolean available) {
        this.classroomNumber = classroomNumber;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return classroomNumber == classroom.classroomNumber && size == classroom.size && available == classroom.available && Objects.equals(id, classroom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classroomNumber, size, available);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", classroomNumber=" + classroomNumber +
                ", size=" + size +
                ", available=" + available +
                '}';
    }
}

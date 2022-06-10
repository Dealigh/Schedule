package com.solvd.Schedule.binary;

public class Classroom {
    private long id;
    private int classroomNumber;
    private boolean available;

    public Classroom(long id, int classroomNumber, boolean available) {
        this.id = id;
        this.classroomNumber = classroomNumber;
        this.available = available;
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
}

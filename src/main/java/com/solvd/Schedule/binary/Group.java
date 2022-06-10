package com.solvd.Schedule.binary;

import java.util.List;

public class Group {
    private long id;
    private char groupLetter;
    private List<Student> students;
    private final static int limitAmount = 10;

    public Group(long id, char groupLetter, List<Student> students) {
        this.id = id;
        this.groupLetter = groupLetter;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getGroupLetter() {
        return groupLetter;
    }

    public void setGroupLetter(char groupLetter) {
        this.groupLetter = groupLetter;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

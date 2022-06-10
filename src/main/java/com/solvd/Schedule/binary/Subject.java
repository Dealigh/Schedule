package com.solvd.Schedule.binary;

public class Subject {
    private long id;
    private long name;
    private Professor professor;

    public Subject(long id, long name, Professor professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

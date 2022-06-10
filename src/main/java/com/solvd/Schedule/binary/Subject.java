package com.solvd.Schedule.binary;

import java.util.Objects;

public class Subject {
    private long id;
    private long name;
    private Professor professor;

    public Subject(long id, long name, Professor professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public Subject(){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return id == subject.id && name == subject.name && Objects.equals(professor, subject.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, professor);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name=" + name +
                ", professor=" + professor +
                '}';
    }
}

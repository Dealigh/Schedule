package com.solvd.Schedule.binary;

import java.util.Objects;

public class Module {
    private long id;
    private Subject subject;
    private Classroom classroom;
    private Shift shift;
    private Group group;

    public Module(long id, Subject subject, Classroom classroom, Shift shift, Group group) {
        this.id = id;
        this.subject = subject;
        this.classroom = classroom;
        this.shift = shift;
        this.group = group;
    }

    public Module(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Module)) return false;
        Module module = (Module) o;
        return id == module.id && Objects.equals(subject, module.subject) && Objects.equals(classroom, module.classroom) && Objects.equals(shift, module.shift) && Objects.equals(group, module.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, classroom, shift, group);
    }

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", subject=" + subject +
                ", classroom=" + classroom +
                ", shift=" + shift +
                ", group=" + group +
                '}';
    }

}
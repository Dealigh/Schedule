package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

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

    public Group(){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return id == group.id && groupLetter == group.groupLetter && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupLetter, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupLetter=" + groupLetter +
                ", students=" + students +
                '}';
    }
}

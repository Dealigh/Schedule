package com.solvd.Schedule.binary;

import java.util.Objects;

public class Professor {
    private long id;
    private long firstName;
    private long lastName;

    public Professor(long id, long firstName, long lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Professor(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFirstName() {
        return firstName;
    }

    public void setFirstName(long firstName) {
        this.firstName = firstName;
    }

    public long getLastName() {
        return lastName;
    }

    public void setLastName(long lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor professor = (Professor) o;
        return id == professor.id && firstName == professor.firstName && lastName == professor.lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                '}';
    }
}


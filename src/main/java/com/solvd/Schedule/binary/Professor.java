package com.solvd.Schedule.binary;

public class Professor {
    private long id;
    private long firstName;
    private long lastName;

    public Professor(long id, long firstName, long lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
}


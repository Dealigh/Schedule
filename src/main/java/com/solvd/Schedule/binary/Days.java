package com.solvd.Schedule.binary;

import java.util.Arrays;
import java.util.Objects;

public class Days {

    private long id;
    private String name;        // tambien con enums creo
    private Shift shift;
    private Subject[] subjects = new Subject[4];        // tal vez cambiar arreglos por listas.

    public Days(long id, String name, Shift shift) {
        this.id = id;
        this.name = name;
        this.shift = shift;
    }
    public Days(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Days)) return false;
        Days days = (Days) o;
        return Objects.equals(id, days.id) && Objects.equals(name, days.name) && Objects.equals(shift, days.shift) && Arrays.equals(subjects, days.subjects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, shift);
        result = 31 * result + Arrays.hashCode(subjects);
        return result;
    }

    @Override
    public String toString() {
        return "Days{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shift=" + shift +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}


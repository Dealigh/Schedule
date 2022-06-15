package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

public class Shift {
    private Long id;
    private String name;        // Capaz conviene hacer esto con enums (Morning, afternoon, night), no me convence el nombre igual


    public Shift(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Shift(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shift)) return false;
        Shift shift = (Shift) o;
        return id == shift.id && Objects.equals(name, shift.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Shift{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" +
                ", modules="  +
                ", calendar=" +
                '}';
    }
}

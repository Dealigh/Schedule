package com.solvd.Schedule.binary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Shifts {
    private final static Logger LOG = LogManager.getLogger(Shifts.class);
    private long id;
    private String name;
    private List<Days> days;

    // Capaz conviene hacer esto con enums (Morning, afternoon, night), no me convence el nombre igual


    public Shifts(String name) {
        this.name = name;
    }

    public Shifts(){
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shifts)) return false;
        Shifts shifts = (Shifts) o;
        return id == shifts.id && Objects.equals(name, shifts.name);
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

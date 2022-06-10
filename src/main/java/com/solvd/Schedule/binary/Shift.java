package com.solvd.Schedule.binary;

import java.util.List;
import java.util.Objects;

public class Shift {

    private long id;
    private String name;        // Capaz conviene hacer esto con enums (Morning, afternoon, night), no me convence el nombre igual
    private List<Days> days;
    private List<Module> modules;
    private Calendar calendar;

    public Shift(long id, String name, List<Days> days, List<Module> modules, Calendar calendar) {
        this.id = id;
        this.name = name;
        this.days = days;
        this.modules = modules;
        this.calendar = calendar;
    }

    public Shift(){

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

    public List<Days> getDays() {
        return days;
    }

    public void setDays(List<Days> days) {
        this.days = days;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shift)) return false;
        Shift shift = (Shift) o;
        return id == shift.id && Objects.equals(name, shift.name) && Objects.equals(days, shift.days) && Objects.equals(modules, shift.modules) && Objects.equals(calendar, shift.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, days, modules, calendar);
    }

    @Override
    public String toString() {
        return "Shift{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                ", modules=" + modules +
                ", calendar=" + calendar +
                '}';
    }
}

package com.solvd.Schedule.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Days {

    private long id;
    private String name;        // tambien con enums creo
    private int hours;
    private int shiftsId;
    private List<Module> modules = new ArrayList<>(4);              //Cambie el array de Materias por una lista de modulos
    // porque los mudolos ademas de la materia tambien tiene el aula que usa.
    // necesario para determinar que aula usar a la hora de agregar una materia.

    public Days(String name, int hours, int shiftsId) {
        this.name = name;
        this.hours = hours;
        this.shiftsId = shiftsId;
    }

    public Days() {
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getShiftsId() {
        return shiftsId;
    }

    public void setShiftsId(int shiftsId) {
        this.shiftsId = shiftsId;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Subject> getSubjects() {
        List<Subject> returnList = null;
        for (Module module : modules) {
            returnList.add(module.getSubject());
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Days)) return false;
        Days days = (Days) o;
        return hours == days.hours && shiftsId == days.shiftsId && Objects.equals(id, days.id) && Objects.equals(name, days.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, hours, shiftsId);
    }

    @Override
    public String toString() {
        return "Days{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", shiftsId=" + shiftsId +
                '}';
    }
}
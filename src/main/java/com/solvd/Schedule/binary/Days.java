package com.solvd.Schedule.binary;

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
}

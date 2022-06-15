package com.solvd.Schedule.binary;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Shift {

    private long id;
    private String name;        // Capaz conviene hacer esto con enums (Morning, afternoon, night), no me convence el nombre igual
    private List<Days> days;
    private List<Module> modules;
    private final static Logger LOG = LogManager.getLogger(Shift.class);

    public Shift(long id, String name, List<Days> days, List<Module> modules) {
        this.id = id;
        this.name = name;
        this.days = days;
        this.modules = modules;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shift)) return false;
        Shift shift = (Shift) o;
        return id == shift.id && Objects.equals(name, shift.name) && Objects.equals(days, shift.days) && Objects.equals(modules, shift.modules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, days, modules);
    }

    @Override
    public String toString() {
        return "Shift{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", days=" + days +
                ", modules=" + modules;
    }

    public void addModule (Module module) {

    

        this.days.forEach(day -> {                                                  // Recorro todos los dias del shift
            Arrays.stream(day.getSubjects()).forEach(subj -> {                      // Recorro todas las materias (4) de ese dia;
                if (subj == null){
                    subj = module.getSubject();                                     // Si alguna materia es null, pongo la materia desde el input module.
                                                                                    // !Falta chequear si la de adelante y la de atras son la misma.
                    LOG.info("Module added succesfully.");
                }
            });
        });

    }

    // Aca tambien hay que buscar en los demas shifts del mismo horario las aulas que estan siendo usadas
    // Probablemente haga falta agregar en shiftDao:
    // shiftDao.getAll(String name) --> name = ("Morning", "Afternoon", "Night")
    // SELECT * FROM shifts WHERE name = name
    // Una vez que tengo esa lista de Shifts del mismo horario (segun lo que pensamos serian 2)
    // Busco en el mismo dia (shift.days.find(day))
    // Busco en la misma hora (dada por la posicion en la que encontre subj = null)
}

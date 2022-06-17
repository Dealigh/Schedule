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

    public List<Days> getDays() {
        return days;
    }

    public void setDays(List<Days> days) {
        this.days = days;
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

    /** Este metodo deberia y podria implementarse usando streams pero la verdad que me rompio
     * la cabeza pensarlo con streams. Quise hacerlo con ciclos tranquis para tenerlo funcionando y ver bien
     * que tengo que hacer primero, despues voy a buscar la forma de hacerlo con streams
     * Aca todavia falta implementar la busqueda de salones disponibles, mirar metodo checkClassrooms
     * en clase Classroom. Falta meter esto en algun lado importate ver mañana.*/

    public void addSubject (Module module) {
        if (checkSubject(module.getSubject())) {                                                // Chequeo si la materia no esta muchas veces en el shift (mirar metodo abajo)
            boolean aux = false;
            for (int i = 0; i < days.size(); i++) {                                // recorro todos los dias del shift
                List<Module> moduls = days.get(i).getModules();                        // Array auxiliar de materias.
                for (int j = 0; j < moduls.size(); j++) {                              // Recorro todas las horas del dia
                    if (moduls.get(j) == null) {                                           // Busco una hora que este vacia
                        moduls.set(j, module);                                           // Guardo la materia que quiero agregar en la hora vacia.
                        aux = true;                                                   // Auxiliar para romper el primer ciclo (El manejado por la i)
                        break;                                                        // Break para romper este ciclo (el segundo manejado x la J) ->
                        // -> Para que no siga buscando horas libres y asignando la materia a esas horas libres
                    }
                }
                if (aux) {                                                         // pregunto por mi auxiliar (si == true significa que la materia fue asignada en alguna hora)
                    break;                                                          // si se cumple, rompo el ciclo para no seguir buscando dias dentro del shift.
                }
            }
        }
    }

    /** Este metodo es para chequear que la materia que queremos meter al shift no exista mas de dos veces en toda la semana
     *  Tenemos 5 dias por shift, 4 horas por dia, entonces 20 posibles horas de materias.
     *  A la vez tenemos 10 materias, si las distribuimos parejo (2 veces cada materia en la semana) nos ahorramos el tener que chequear
     *  que no haya mas de 3 materias por dia.*/

    private boolean checkSubject (Subject subject) {
        AtomicInteger subjectCount = new AtomicInteger();           //contador de la cantidad de veces que encontramos la materia
        days.forEach(day -> {                                       // recorro los dias del shift
            List<Subject> subj = day.getSubjects();                    // agarro un arreglo de las materias de cada dia
            for (Subject subject1 : subj) {                         // recorro las materias
                if (subject1 == subject) {                          // si encuentro la materia ya metida sumo el contador
                    subjectCount.getAndIncrement();
                }
            }
        });
        if (subjectCount.get() < 3){                                // si el contador < 3 la materia aparece 2 veces o menos, devuelvo true sino false.
            return true;
        }else {
            LOG.error ("ERROR: the subject has 2 or more lessons a week.");
            return false;
        }
    }

}



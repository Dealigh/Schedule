package com.solvd.Schedule.binary;

import com.solvd.Schedule.services.ClassroomService;
import com.solvd.Schedule.services.jdbcImplem.ClassroomServiceImpl;

import java.util.List;
import java.util.Objects;

public class Classroom {
    private long id;
    private int classroomNumber;
    private int size;
    private boolean available;

    public Classroom(int classroomNumber, int size, boolean available) {
        this.classroomNumber = classroomNumber;
        this.size = size;
        this.available = available;
    }

    public Classroom() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(int classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return classroomNumber == classroom.classroomNumber && size == classroom.size && available == classroom.available && Objects.equals(id, classroom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classroomNumber, size, available);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", classroomNumber=" + classroomNumber +
                ", size=" + size +
                ", available=" + available +
                '}';
    }

    /**
     * Este metodo es para chequear que salones estan disponibles en un determinado dia a una determinada hora
     */

    private List<Classroom> checkClassrooms(Shifts shift, Days day, int time) {
        ClassroomService classroomServ = new ClassroomServiceImpl();
        List<Classroom> availableClassrooms = classroomServ.getAllClassrooms();                 //lista de todas las aulas para ir sacando de aca las q no esten disponibles
        // Busco todos los shifts que tengan el mismo nombre (Mañana, Tarde).
        // Necesito poder obtener de la base de datos todos los shifts que tengan el mismo nombre
        // ShiftService shiftServ = new ShiftService ();
        // List<Shift> shiftList = shiftServ.getByName(shift.getName)
        // Busco los dias puntuales de todos los shifts.

        List<Shifts> shiftsList = null;                                                         // solo para probar los streams desp se borra cuando tenga la lista buena.

        shiftsList.stream().forEach(shi -> {
            shi.getDays().stream().filter(d -> (d.getName() == day.getName())).toList()         // lista de dias iguales de todos los turnos (todos los lunes por ejemplo)
                    .forEach(sameDay -> {
                        availableClassrooms.remove(sameDay.getModules().get(time).getClassroom());          // quito las aulas utilizadas de una lista de todos las aulas
                    });
        });
        return availableClassrooms;
    }
}

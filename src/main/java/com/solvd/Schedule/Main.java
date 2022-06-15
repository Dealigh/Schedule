package com.solvd.Schedule;

import com.solvd.Schedule.binary.Classroom;
import com.solvd.Schedule.binary.Professor;
import com.solvd.Schedule.binary.Student;
import com.solvd.Schedule.dao.IClassroomDAO;
import com.solvd.Schedule.dao.IProfessorDAO;
import com.solvd.Schedule.dao.impl.ClassroomDAO;
import com.solvd.Schedule.dao.impl.GroupDAO;
import com.solvd.Schedule.dao.impl.ProfessorDAO;
import com.solvd.Schedule.dao.impl.StudentDAO;
import com.solvd.Schedule.services.*;
import com.solvd.Schedule.services.jdbcImplem.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //testing student
//
        StudentDAO stud = new StudentDAO();
//        System.out.println(stud.getEntity(2L));
//        System.out.println(stud.getAll());

        Student theStud= new Student();
        theStud.setFirstName("Solange");
        stud.update(28L, theStud);

        //testing groups
//        GroupService groups = new GroupServiceImpl();
//        System.out.println(groups.getAllGroups());
//        System.out.println(groups.getGroup(2L));

//        //testin days
//        DaysService days = new DaysServiceImpl();
//        System.out.println(days.getDays(2L));
//        System.out.println(days.getAllDays());
//
//        //testing getting shift/weeks
//        ShiftService shift = new ShiftServiceImpl();
//        System.out.println(shift.getShift(2L).getName());

//        //Classrooms DAO
//        ClassroomService classroomDAO = new ClassroomServiceImpl();
//        List<Classroom> thisList = classroomDAO.getAllClassrooms();
//        for (Classroom u : thisList) {
//            LOG.info(u.toString());
//        }
//            LOG.info(classroomDAO.getClassroom(3L));


        //Probando profesores
//        ProfessorService professor = new ProfessorServiceImpl();
//        LOG.info(professor.getProfessor(2L).getFirstName());
//        LOG.info(professor.getProfessor(2L).getLastName());
//        LOG.info(professor.getProfessor(2L).getId());
//
//        //vamo a crear un profe
//        //Professor Dani = new Professor("Daniel", "Messi");
//        //professor.create(Dani);
//
//        //vamo a deletear al messi. ANDA
//        //professor.delete(11L);
//
//        //Update ANDA.
//        Professor updateProfessor = new Professor();
//        updateProfessor.setFirstName("James");
//        updateProfessor.setLastName("Harden");
//        professor.update(1L, updateProfessor);
//
//        List<Professor> thisList = professor.getProfessors();
//        for (Professor u : thisList) {
//            LOG.info(u.toString());
//        }


        }
    }


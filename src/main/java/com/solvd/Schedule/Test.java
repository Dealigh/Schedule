package com.solvd.Schedule;

import com.solvd.Schedule.binary.Student;
import com.solvd.Schedule.binary.Subject;
import com.solvd.Schedule.dao.impl.*;
import com.solvd.Schedule.services.*;
import com.solvd.Schedule.services.jdbcImplem.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Test {
    private static final Logger LOG = LogManager.getLogger(Test.class);

    public static void main(String[] args) {

        //TENEMOS QUE METER UN JSON ANTES QUE NOS OLVIDEMOS
        //TENEMOS QUE METER UN JSON ANTES QUE NOS OLVIDEMOS
        //TENEMOS QUE METER UN JSON ANTES QUE NOS OLVIDEMOS


        //testing days
//
//        DaysService day = new DaysServiceImpl();
//        System.out.println(day.getDays(2));
//        System.out.println(day.getAllDays());
//        System.out.println(day.getAllbyShiftId(3));

        ShiftService shift = new ShiftServiceImpl();
        System.out.println(shift.getAllShiftsbyName("Morning"));

        ModuleService mods = new ModuleServiceImpl();
        System.out.println(mods.getAllModulesbyShiftId(1));


//        //testing module
//
//        ModuleDAO mod = new ModuleDAO();
//        System.out.println(mod.getAll());
//        System.out.println(mod.getEntity(2));
//


//        //testing subject
//        SubjectService subs = new SubjectServiceImpl();
//        System.out.println(subs.getSubject(3));
//        List<Subject> thisList = subs.getAllSubjects();
//        for (Subject u : thisList) {
//            LOG.info(u.toString());
//        }

//        //testing student
//        StudendService nnnStud = new StudentServiceImpl();
//        System.out.println(nnnStud.getStudent(2));
//        List<Student> thisList = nnnStud.getAllStudentsbyId(2);
//      for (Student u : thisList) {
//            LOG.info(u.toString());
//        }
////
//        Student theStud= new Student();
//        theStud = stud.getEntity(1);
//        theStud.setFirstName("Lionel Andres");
//        stud.update(1, theStud);

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


//            //Probando profesores
//            ProfessorService professor = new ProfessorServiceImpl();
//            LOG.info(professor.getProfessor(2L).getFirstName());
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


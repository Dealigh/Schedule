package com.solvd.Schedule;

import com.solvd.Schedule.binary.Classroom;
import com.solvd.Schedule.binary.Professor;
import com.solvd.Schedule.binary.Subject;
import com.solvd.Schedule.services.ProfessorService;
import com.solvd.Schedule.services.jdbcImplem.ProfessorServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        //Probando profesores
        ProfessorService professorService = new ProfessorServiceImpl();
        LOG.info(professorService.getProfessor(2L).getFirstName());
        LOG.info(professorService.getProfessor(2L).getLastName());
        LOG.info(professorService.getProfessor(2L).getId());

        //vamo a crear un profe
        //Professor Dani = new Professor("Daniel", "Messi");
        //professor.create(Dani);

        //vamo a deletear al messi. ANDA
        //professor.delete(11L);

        //Update ANDA.
        Professor updateProfessor = new Professor();
        updateProfessor.setFirstName("James");
        updateProfessor.setLastName("Harden");
        professorService.update(1L, updateProfessor);

        List<Professor> thisList = professorService.getProfessors();
        for (Professor u : thisList) {
            LOG.info(u.toString());
        }


    }
}

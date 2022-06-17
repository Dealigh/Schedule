package com.solvd.Schedule;

import com.solvd.Schedule.util.exceptions.InvalidSelection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static com.solvd.Schedule.util.json.JsonListener.getProfessorsList;
import static com.solvd.Schedule.util.menuOptions.Menu.menuOptions;

public class Runner {

    private static final Logger LOG = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        menuOptions();
        switch (sc.nextInt()) {
            case 1:
                LOG.info("Option 1");
                break;
            case 2:
                LOG.info("Option 2");
                break;
            case 3:
                LOG.info("Here are all the Professors in our School");
                getProfessorsList();
                break;
            case 4:
                LOG.info("option 4");
                break;
            default:
                throw new InvalidSelection("You must chose a number between the numbered options");
        }
    }
}
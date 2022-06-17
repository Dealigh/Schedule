package com.solvd.Schedule;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.Schedule.binary.Professor;
import com.solvd.Schedule.util.Constants;
import com.solvd.Schedule.util.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Runner {

    private static final Logger LOG = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        Menu menu = new Menu();
        ObjectMapper om = new ObjectMapper();


        int option = menu.menu();
        switch (option) {
            case 1:
                LOG.info("Option 1");

                break;

            case 2:
                LOG.info("Option 2");

                break;

            case 3:
                LOG.info("This are all the Professors in our School");
                try {
                    JavaType secodType = om.getTypeFactory().constructCollectionType(List.class, Professor.class);
                    List professors = om.readValue(new File(Constants.JSON), secodType);
                    for (Object u : professors) {
                        LOG.info(u.toString());
                    }
                } catch (IOException e) {
                    LOG.error("IOException", e);
                }

                break;
            case 4:

                LOG.info("option 4");

                break;
        }
    }
}
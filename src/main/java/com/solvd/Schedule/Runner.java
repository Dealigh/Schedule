package com.solvd.Schedule;

import com.solvd.Schedule.util.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger LOG = LogManager.getLogger(Runner.class);

    public static void main(String[] args) {
        Menu menu = new Menu();

        int option = menu.menu();
        switch (option) {
            case 1:
                LOG.info("Option 1");

                break;

            case 2:
                LOG.info("Option 2");

                break;

            case 3:
                LOG.info("Option 3");


                break;
            case 4:

                LOG.info("option 4");

                break;
        }
    }
}
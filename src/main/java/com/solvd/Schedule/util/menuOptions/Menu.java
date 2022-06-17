package com.solvd.Schedule.util.menuOptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu {

    private static final Logger LOG = LogManager.getLogger(Menu.class);

    public static void menuOptions() {

        MenuOptions[] options = MenuOptions.values();
        LOG.info("Please select an option:");
        for (MenuOptions o : options) {
            LOG.info((o.ordinal() + 1) + ") " + o.getMenuOptions());
        }
    }
}

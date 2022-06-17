package com.solvd.Schedule.util.menuOptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Menu {

    private static final Logger LOG = LogManager.getLogger(Menu.class);
    private final Scanner scanner = new Scanner(System.in);

    public static void menuOptions() {

        MenuOptions[] options = MenuOptions.values();
        LOG.info("Please press the number if you are here for: ");
        for (MenuOptions o : options) {
            LOG.info((o.ordinal() + 1) + ") " + o.getMenuOptions());
        }
    }
}

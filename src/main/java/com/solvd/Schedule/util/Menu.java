package com.solvd.Schedule.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final Logger LOG = LogManager.getLogger(Menu.class);
    private final Scanner scanner = new Scanner(System.in);

    public int menu() {
        {
            int option = 0;
            LOG.debug("\nChose the option below:\n" + "Option 1: xxxxxxx\n"
                    + "Option 2:xxxxxxxx\n"
                    + "Option 3:xxxxxx \n "
                    + "Option 4:xxxxxxx\n ");
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                LOG.debug("Dear User, try to put a number");
                throw new RuntimeException("Error in here", e);
            }
            return option;
        }
    }
}

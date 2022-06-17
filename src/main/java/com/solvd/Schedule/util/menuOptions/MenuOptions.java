package com.solvd.Schedule.util.menuOptions;

public enum MenuOptions {

    OPTION_1("xxxxxxxx"),
    OPTION_2("xxxxxxxx"),
    OPTION_3("Do you want to see all our Professors?\n"),
    OPTION_4("xxxxxxxx");

    private String menuOptions;

    MenuOptions(String menuOptions) {
        this.menuOptions = menuOptions;
    }

    public String getMenuOptions() {
        return menuOptions;
    }
}

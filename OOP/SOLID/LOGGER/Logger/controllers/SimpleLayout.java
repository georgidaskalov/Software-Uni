package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String date, ReportLevel reportlevel, String message) {
        return String.format("%s - %s - %s",date,reportlevel.toString(),message);
    }

    @Override
    public String getType() {
        return "SimpleLayout";
    }
}

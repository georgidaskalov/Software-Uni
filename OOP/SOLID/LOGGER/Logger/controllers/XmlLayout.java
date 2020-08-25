package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.Layout;

public class XmlLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportlevel, String message) {
        return String.format("<log>%n" +
                "<date>%s</date>%n" +
                "<level>%s</level>%n" +
                "<message>%s</message>%n" +
                "</log>",date,reportlevel.toString(),message);
    }

    @Override
    public String getType() {
        return "XmlLayout";
    }
}

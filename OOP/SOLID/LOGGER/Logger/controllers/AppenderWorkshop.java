package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.Appender;
import OOP.SOLID.LOGGER.Logger.interfaces.AppenderFactory;
import OOP.SOLID.LOGGER.Logger.interfaces.Layout;

public class AppenderWorkshop implements AppenderFactory {
    @Override
    public Appender produce(String type, ReportLevel reportLevel, Layout layout) {
        switch (type) {
            case "ConsoleAppender":
                return new ConsoleAppender(reportLevel,layout);
            case "FileAppender":
                return new FileAppender(reportLevel,layout);
            default:
                throw new IllegalStateException(
                        "Not valid type of appender for " + type + " param");
        }
    }
}

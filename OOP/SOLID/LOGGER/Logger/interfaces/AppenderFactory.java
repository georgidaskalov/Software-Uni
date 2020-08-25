package OOP.SOLID.LOGGER.Logger.interfaces;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;

public interface AppenderFactory {
    Appender produce(String type, ReportLevel reportLevel, Layout layout);

}

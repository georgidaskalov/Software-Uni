package OOP.SOLID.LOGGER.Logger.interfaces;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;

public interface Appender {
    void append(String date, ReportLevel reportLevel, String message);
    ReportLevel getReportLevel();


}

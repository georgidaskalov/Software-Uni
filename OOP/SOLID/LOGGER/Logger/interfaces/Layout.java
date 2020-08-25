package OOP.SOLID.LOGGER.Logger.interfaces;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reportlevel , String message);
    String getType();
}

package OOP.SOLID.LOGGER.Logger.interfaces;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;

public interface File {
    void write(String text);
    int getSize();
}

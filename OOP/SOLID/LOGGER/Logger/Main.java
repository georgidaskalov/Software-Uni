package OOP.SOLID.LOGGER.Logger;

import OOP.SOLID.LOGGER.Logger.controllers.AppenderWorkshop;
import OOP.SOLID.LOGGER.Logger.controllers.LayoutWorkshop;
import OOP.SOLID.LOGGER.Logger.core.EngineImpl;
import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.AppenderFactory;
import OOP.SOLID.LOGGER.Logger.interfaces.LayoutFactory;
import OOP.SOLID.LOGGER.Logger.logger.Logger;
import OOP.SOLID.LOGGER.Logger.controllers.ConsoleAppender;
import OOP.SOLID.LOGGER.Logger.controllers.SimpleLayout;
import OOP.SOLID.LOGGER.Logger.interfaces.Appender;
import OOP.SOLID.LOGGER.Logger.interfaces.Layout;
import OOP.SOLID.LOGGER.Logger.logger.MessageLogger;
import OOP.polyMorphismEx.Calculator.InputInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        Logger logger = new MessageLogger();

        new EngineImpl(reader , logger).run();

        System.out.println(logger.toString());
    }
}

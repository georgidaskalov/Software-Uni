package OOP.SOLID.LOGGER.Logger.core;

import OOP.SOLID.LOGGER.Logger.controllers.FactoryRepository;
import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.Appender;
import OOP.SOLID.LOGGER.Logger.interfaces.Engine;
import OOP.SOLID.LOGGER.Logger.interfaces.InputParser;
import OOP.SOLID.LOGGER.Logger.logger.Logger;

import java.io.BufferedReader;
import java.io.IOException;

public class EngineImpl implements Engine {
    private boolean isRunning;
    private BufferedReader reader;
    private Logger logger;

    public EngineImpl(BufferedReader reader, Logger logger) {
        this.reader = reader;
        this.logger = logger;
    }

    @Override
    public void run() throws IOException {
        this.isRunning = true;
        String line = reader.readLine();
        addAppenders(Integer.parseInt(line));
        while (this.isRunning) {
            line = reader.readLine();
            String[] parse = InputParser.parse(line);

            if (!parse[0].equals("END")){
                logMessage(parse);
            }
            this.isRunning = !parse[0].equals("END");
        }

    }

    private void logMessage(String[] args) {
        ReportLevel reportLevel = ReportLevel.valueOf(args[0]);
        String date = args[1];
        String message = args[2];

        switch (reportLevel){
            case INFO:
                logger.logInfo(date, message);
                break;
            case ERROR:
                logger.logError(date,message);
                break;
            case FATAL:
                logger.logFatal(date,message);
                break;
            case WARNING:
                logger.logWarning(date,message);
                break;
            case CRITICAL:
                logger.logCritical(date,message);
                break;
            default:
                throw new IllegalStateException("Unknown enum value for "+ reportLevel);
        }
    }

    private void addAppenders(int n) throws IOException {

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            ReportLevel reportLevel = tokens.length == 3
                    ? ReportLevel.valueOf(tokens[2].toUpperCase())
                    : ReportLevel.INFO;

            Appender appender = FactoryRepository.getAppenderFactory()
                    .produce(tokens[0], reportLevel,
                            FactoryRepository.getLayoutFactory().produce(tokens[1]));

            logger.addAppender(appender);

        }
    }

}

package OOP.SOLID.LOGGER.Logger.controllers;

import OOP.SOLID.LOGGER.Logger.enums.ReportLevel;
import OOP.SOLID.LOGGER.Logger.interfaces.File;

public class LogFile implements File {
    private StringBuilder stringBuilder;

    public LogFile(){
        this.stringBuilder = new StringBuilder();
    }

    @Override
    public void write(String text) {
        this.stringBuilder.append(text);

    }

    @Override
    public int getSize() {
        int sum = 0;

        for (int i = 0; i < this.stringBuilder.length(); i++) {
            char symbol =  this.stringBuilder.charAt(i);
            if (Character.isAlphabetic(symbol)){
                sum+= symbol;
            }

        }


        return sum;
    }
}

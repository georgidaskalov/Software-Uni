package OOP.SOLID.LOGGER.Logger.interfaces;

import OOP.SOLID.LOGGER.Logger.logger.Logger;

public interface InputParser {
   static String[] parse(String input){
        if (input.contains("|")){
            return input.split("\\|");
        }
       return input.split("\\s+");
   }
}

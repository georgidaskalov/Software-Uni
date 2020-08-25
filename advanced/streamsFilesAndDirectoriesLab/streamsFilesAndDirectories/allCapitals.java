package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class allCapitals {
    public static void main(String[] args) {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            while (line != null) {

                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

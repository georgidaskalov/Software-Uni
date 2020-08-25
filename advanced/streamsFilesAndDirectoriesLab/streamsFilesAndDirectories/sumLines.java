package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class sumLines {
    public static void main(String[] args) {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "input.txt";



        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();

            int sum = 0;
            while (line != null) {
                sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

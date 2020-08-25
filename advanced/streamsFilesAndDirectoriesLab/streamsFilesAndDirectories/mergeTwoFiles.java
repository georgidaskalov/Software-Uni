package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class mergeTwoFiles {
    public static void main(String[] args) {

        String path1 = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathMerge = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputThree.txt";



        try (BufferedReader brstart = new BufferedReader(new FileReader(path1));
             BufferedReader brMerge = new BufferedReader(new FileReader(path2))

        ) {
            List<String> words = new ArrayList<>();
            String line = brstart.readLine();
            while (line != null){
                String[] tokens = line.split("\\s+");
                words.addAll(Arrays.asList(tokens));
                line = brstart.readLine();
            }

            List<String> text = new ArrayList<>();
            String nLine = brMerge.readLine();
            while (nLine != null){
                String[] tokens = nLine.split("\\s+");
                text.addAll(Arrays.asList(tokens));
                nLine = brMerge.readLine();
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

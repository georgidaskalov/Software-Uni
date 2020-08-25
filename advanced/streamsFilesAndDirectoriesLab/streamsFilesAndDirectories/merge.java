package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.*;

public class merge {
    public static void main(String[] args) {

        String path1 = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path2 = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        String pathMerge = "F:\\softuni\\exercise\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputThree.txt";

        try (
                BufferedReader inputOneReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File(path1)
                                )
                        )
                );
                BufferedReader inputTwoReader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File(path2)
                                )
                        )
                );
                PrintWriter out = new PrintWriter(new FileWriter(pathMerge))
        ) {
            String line;

            while ((line = inputOneReader.readLine()) != null) {
                out.println(line);
            }


            while ((line = inputTwoReader.readLine()) != null) {
                out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
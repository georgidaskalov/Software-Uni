package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.*;

public class lineNumbers {
    public static void main(String[] args) {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "inputLineNumbers.txt";
        String output = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "inputLineNumbersxx.txt";
        String newline = "\n";
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             PrintWriter pr = new PrintWriter(new FileOutputStream(output))
        ) {
            String line = br.readLine();
            int count = 1;
            while (line != null){
                pr.write(count++ +". " + line);
                pr.write(newline);


                line = br.readLine();
            }
            pr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

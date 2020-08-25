package streamsFilesAndDirectoriesLab;

import java.io.*;

public class writeEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "input.txt";
        String output = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "inputxx.txt";
        String newline = "\n";
        try (BufferedReader br = new BufferedReader(new FileReader(path));
             PrintWriter pr = new PrintWriter(new FileOutputStream(output))
        ) {
            String line = br.readLine();
            while (line != null){
                pr.write(line.toUpperCase());
                pr.write(newline);


                line = br.readLine();
            }
            pr.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

package streamsFilesAndDirectoriesLab;


import java.io.*;
import java.util.Scanner;

public class extractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "F:\\softuni\\input.txt";
        String output = "F:\\softuni\\output.txt";

        FileInputStream fileStream = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(output);
        PrintWriter printWriter = new PrintWriter(fos);
        Scanner scanner = new Scanner(fileStream);

        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                int oneInt = scanner.nextInt();
                printWriter.println(oneInt);
            }else {
                scanner.next();
            }

            printWriter.flush();
        }



        printWriter.close(); // not neccessary but good practice closes printwriter.
    }
}

package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.*;
import java.util.*;

public class wordCount {
    public static void main(String[] args) {

        String read = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "words.txt";
        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String newline = "\n";
        try (BufferedReader brstart = new BufferedReader(new FileReader(read));
             BufferedReader brCheck = new BufferedReader(new FileReader(path))
        ) {
            List<String> words = new ArrayList<>();
            String line = brstart.readLine();
            while (line != null){
                String[] tokens = line.split("\\s+");
                words.addAll(Arrays.asList(tokens));
                line = brstart.readLine();
            }

            List<String> text = new ArrayList<>();
            String nLine = brCheck.readLine();
            while (nLine != null){
                String[] tokens = nLine.split("\\s+");
                text.addAll(Arrays.asList(tokens));
                nLine = brCheck.readLine();
            }
            Map<String, Integer> wordXcount = new LinkedHashMap<>();
            for (String s : text) {
                String word123 = "";
                for (String word : words) {
                    if (s.equals(word)){
                        word123 = word;
                        wordXcount.putIfAbsent(word123, 0);
                        wordXcount.put(word123, wordXcount.get(word123) + 1);
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : wordXcount.entrySet()) {
                System.out.println(entry.getKey()  + " - " + entry.getValue());
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

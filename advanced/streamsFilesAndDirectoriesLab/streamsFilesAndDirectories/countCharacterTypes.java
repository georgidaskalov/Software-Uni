package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class countCharacterTypes {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\" +
                "input.txt";
        Set<Character> punctuation = Set.of(',', '!', '?','.');
        Set<Character> vowels = Set.of('a','e','i' ,'o', 'u');

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            int vowC = 0;
            int consC = 0;
            int punctC= 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c != ' ') {


                        if (punctuation.contains(c)) {
                            punctC++;
                        } else if (vowels.contains(c)) {
                            vowC++;
                        } else {
                            consC++;
                        }
                    }
                }
                line = reader.readLine();
            }
            System.out.printf("Vowels: %d%n" +
                    "Consonants: %d%n" +
                    "Punctuation: %d",vowC,consC,punctC);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

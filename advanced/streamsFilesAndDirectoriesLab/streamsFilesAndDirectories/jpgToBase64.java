package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class jpgToBase64 {
    public static void main(String[] args) throws IOException {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\img.jpg";

        byte[] bytes = Files.readAllBytes(Path.of(path));

        String encoded = Base64.getEncoder().encodeToString(bytes);

       // new PrintWriter("img.txt").write(encoded);

        new FileOutputStream("copy-img.jpg").write(bytes);
    }
}

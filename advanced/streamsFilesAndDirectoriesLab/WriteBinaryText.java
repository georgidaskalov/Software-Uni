package streamsFilesAndDirectoriesLab;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteBinaryText {
    public static void main(String[] args) throws IOException {

        String path = "F:\\softuni\\input.txt";
        String output = "F:\\softuni\\output.txt";

        FileInputStream fileStream = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(output);

        Set<Character> punctuation = Set.of(',', '!', '?','.');

        int OneByte = fileStream.read();
        while (OneByte != -1){
            if (!punctuation.contains((char) OneByte)){
                fos.write(OneByte);
                System.out.print((char) OneByte);
            }
            OneByte = fileStream.read();

        }


    }
}

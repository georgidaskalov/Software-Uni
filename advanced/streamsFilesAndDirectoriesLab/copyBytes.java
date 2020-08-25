package streamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyBytes {
    public static void main(String[] args) throws IOException {

        String path = "F:\\softuni\\input.txt";
        String output = "F:\\softuni\\output.txt";

        FileInputStream fileStream = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(output);

        int space = ' ';
        int newLine = '\n';

        int OneByte = fileStream.read();
        while (OneByte != -1) {
            String stringNumber = String.valueOf(OneByte);
            if (OneByte == space || OneByte == newLine){
                fos.write(OneByte);
            }else {
                for (int i = 0; i < stringNumber.length(); i++) {
                    fos.write(stringNumber.charAt(i));
                }
            }
            OneByte = fileStream.read();
        }

    }
}
package streamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class readBinaryText {
    public static void main(String[] args) {

        String path = "F:\\softuni\\input.txt";

        try (FileInputStream filestream = new FileInputStream(path)){
            int OneByte = filestream.read();
            while (OneByte >= 0){
                System.out.printf("%s ",Integer.toBinaryString(OneByte));
                OneByte = filestream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

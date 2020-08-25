package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.File;

public class fileFolderSize {
    public static void main(String[] args) {

        String path = "F:\\softuni\\exercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File file = new File(path);

        long size = 0;

        for (File innerFile : file.listFiles()){
            size+= innerFile.length();
        }
        System.out.printf("Folder size: %d",size);



    }
}

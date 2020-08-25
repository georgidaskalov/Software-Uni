package streamsFilesAndDirectoriesLab;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;

public class listFiles {
    public static void main(String[] args) throws IOException {

        String path = "F:\\softuni\\Files-and-Streams";
        //String output = "F:\\softuni\\output.txt";

        try {
            File f = new File(path);
            File[] files = f.listFiles();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(path, ".txt");


            for (int i = 0; i < files.length; i++) {

                System.out.println(filter.toString());
                String output = files[i].getName() + ": ["  +files[i].length() + "]";
                //System.out.println(output);
            }
            
        }catch (Exception e){
            System.err.println(e.getMessage());
        }




    }

}

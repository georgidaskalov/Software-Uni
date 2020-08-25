package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class serializeArrays {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <100 ; i++) {
            numbers.add(i);
        }

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("demo.ser"));
        outputStream.writeObject(numbers);

        ObjectInputStream InputStream = new ObjectInputStream(new FileInputStream("demo.ser"));
        ArrayList<Integer> backup = (ArrayList<Integer>) InputStream.readObject();

        for (int i = 0; i < backup.size(); i++) {
            System.out.println(backup.get(i));
        }

    }
}

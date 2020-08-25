package streamsFilesAndDirectoriesLab.streamsFilesAndDirectories;

import java.io.*;

@SuppressWarnings("unchecked")
public class serializeCustomObject {

    public static class Course implements Serializable {
        private String name;
        private int students;

        public Course(String name , int students){
            this.name = name;
            this.students = students;
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    Course course = new Course("Java - Advanced",100000);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("course.ser"));

        outputStream.writeObject(course);

        ObjectInputStream InputStream = new ObjectInputStream(new FileInputStream("course.ser"));
        Course courseTwo  = (Course) InputStream.readObject();
        System.out.println(course.name);
        System.out.println(course.students);

    }
}

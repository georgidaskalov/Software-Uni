package streamsFilesAndDirectoriesLab;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class listDirectories {
    public static void main(String[] args) throws IOException {
        String path = "F:\\softuni\\lab\\Files-and-Streams";

        File filesAndStreamsDir = new File(path);
        Deque<File> queue = new ArrayDeque<>();
        queue.push(filesAndStreamsDir);

        List<String> fileNames = new ArrayList<>();

        while (!queue.isEmpty()) {
            File file = queue.poll();

            fileNames.add(file.getName());

            File[] currentFolderContent = file.listFiles();
            for (File childFile : currentFolderContent) {
                if (childFile.isDirectory()) {
                    queue.offer(childFile);
                }
            }
        }

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

        System.out.println(fileNames.size() + " folders");
    }
}
package stacksAndQueues.stacksAndQueueExercise;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String format = "(?<name>[A-Z0-9]+)-(?<processTime>[0-9]+)";
        String[] inputRobots = scanner.nextLine().split(";");
        Map<String, Integer> robots = splitRobotsDataIntoLinkedMap(inputRobots);
        ArrayDeque<String> product = new ArrayDeque<>();

        int[] processTimes = new int[robots.size()];

        String inputTime = scanner.nextLine();
        if (inputTime.length() == 7){
            inputTime = "0" + inputTime;
        }

        LocalTime time = LocalTime.parse(inputTime);


        String line = scanner.nextLine();
        while (!line.equals("End")) {
            product.add(line);

            line = scanner.nextLine();
        }
        while (!product.isEmpty()) {
            time = time.plusSeconds(1);

            String currentProd = product.poll();

            decreaseProcessTime(processTimes);
            if (!assignJob(robots, processTimes, currentProd, time)) {
                product.offer(currentProd);
            }
        }
    }

    private static void decreaseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] > 0) {
                --processTimes[i];
            }
        }
    }

    private static boolean assignJob(Map<String, Integer> robots, int[] processTimes, String currentProd, LocalTime time) {

        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] == 0) {
                String robotName = "";
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        logJobAssign(entry.getKey(), currentProd, time);
                        return true;
                    }
                    count++;
                }
            }
        }
        return false;
    }

    private static void logJobAssign(String name, String product, LocalTime time) {

        String format = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(String.format("%s - %s [%s]", name, product,format));
    }

    private static Map<String, Integer> splitRobotsDataIntoLinkedMap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();

        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf("-");
            String name = line.substring(0, index);
            int time = Integer.parseInt(line.substring(index + 1));

            robots.put(name, time);
        }

        return robots;
    }
}

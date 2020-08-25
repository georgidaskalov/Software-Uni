package SetsAndMapsLab.setsAndMapsExerc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = "";
        Map<String, Integer> materialsAndQuantity = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            resource = scanner.nextLine();
            if (!resource.equals("stop")) {
                if (!materialsAndQuantity.containsKey(resource)) {
                    materialsAndQuantity.put(resource, 0);
                }
                int quantity = Integer.parseInt(scanner.nextLine());
                materialsAndQuantity.put(resource, materialsAndQuantity.get(resource) + quantity);
            }
        }

        for (Map.Entry<String, Integer> entry : materialsAndQuantity.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%s -> %d%n", key, value);
        }
    }
}
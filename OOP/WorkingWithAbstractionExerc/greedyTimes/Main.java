
package OOP.WorkingWithAbstractionExerc.greedyTimes;

import OOP.WorkingWithAbstractionExerc.greedyTimes.Treasure;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        Treasure treasure =  new Treasure(scanner.nextLine().split("\\s+"));

        Bag bag = new Bag(capacity);

        for (var pair : treasure) {
            String first = pair.getFirst();
            Long value = pair.getSecond();
            String type = null;

            if (first.length() == 3) {
                type = "Cash";
            } else if (first.toLowerCase().endsWith("gem")) {
                type = "Gem";
            } else if (first.toLowerCase().equals("gold")) {
                type = "Gold";
            }
            if (bag.hasRoomFor(value) && type != null) {

            }
        }




            switch (kvoE) {
                case "Gem":
                    if (!bag.containsKey(kvoE)) {
                        if (bag.containsKey("Gold")) {
                            if (broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(kvoE).values().stream().mapToLong(e -> e).sum() + broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(kvoE)) {
                        if (bag.containsKey("Gem")) {
                            if (broika > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(kvoE).values().stream().mapToLong(e -> e).sum() + broika > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(kvoE)) {
                bag.put((kvoE), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(kvoE).containsKey(name)) {
                bag.get(kvoE).put(name, 0L);
            }


            bag.get(kvoE).put(name, bag.get(kvoE).get(name) + broika);

        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
 */   }
}
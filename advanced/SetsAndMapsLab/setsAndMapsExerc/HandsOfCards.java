package SetsAndMapsLab.setsAndMapsExerc;

import java.util.*;
import java.util.stream.Collectors;

public class HandsOfCards {

    public static Map<Character, Integer> powerTable = Map.of(
            'J', 11,
            'Q', 12,
            'K', 13,
            'A', 14,
            'S', 4,
            'H', 3,
            'D', 2,
            'C', 1

    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        while (!input.equals("JOKER")) {
            lines.add(input);
            input = scanner.nextLine();
        }
        Map<String, Set<String>> playersWithDecks = new LinkedHashMap<>();

        lines.stream().map(line -> {
            String[] tokens = line.split(": ");
            Set<String> cards = Arrays.stream(tokens[1].split(", ")).collect(Collectors.toSet());
            return Map.entry(tokens[0], cards);
        }).forEach(entry -> {
            playersWithDecks.putIfAbsent(entry.getKey(), new HashSet<>());
            playersWithDecks.get(entry.getKey()).addAll(entry.getValue());
        });


        playersWithDecks.entrySet()
                .stream()
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(),
                            entry.getValue().stream()
                                    .mapToInt(HandsOfCards::calcCardPower)
                                    .sum()
                    ));
                });

    }

    public static int calcCardPower(String card) {
        char first = card.charAt(0);
        int power = 0;
        if (Character.isDigit(first)) {
            power = first - '0';
            power = power == 1 ? 10 : power;
        } else {
            power = powerTable.get(first);
        }

        power *= powerTable.get(card.charAt(card.length() - 1));

        return power;
    }
}

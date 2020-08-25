package ExamTests.MyTESTprep;

import java.util.*;
import java.util.stream.Collectors;

public class SantasPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> materialStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(materialStack::push);

        ArrayDeque<Integer> magicLevels = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));
        TreeMap<String, Integer> giftXcount = new TreeMap<>();
        int doll = 0;
        int woodT = 0;
        int bic = 0;
        int teddy = 0;

        while (!materialStack.isEmpty() && !magicLevels.isEmpty()) {
            int material = materialStack.peek();
            int magicLvl = magicLevels.peek();
            if (material == 0 || magicLvl == 0){
                if (material == 0) {
                    materialStack.pop();
                }
                if (magicLvl == 0) {
                    magicLevels.poll();
                }
                continue;
            }
            int sum = magicLvl * material;
            if (sum < 0) {
                sum = material + magicLvl;
                materialStack.pop();
                magicLevels.poll();
                materialStack.push(sum);

            } else {
                if (sum == 400) {
                    String toy = "Bicycle";
                    giftXcount.putIfAbsent(toy, 0);
                    giftXcount.put(toy, giftXcount.get(toy) + 1);
                    materialStack.pop();
                    magicLevels.poll();
                    bic++;
                    sum = 0;
                } else if (sum == 300) {
                    String toy = "Teddy bear";
                    giftXcount.putIfAbsent(toy, 0);
                    giftXcount.put(toy, giftXcount.get(toy) + 1);
                    materialStack.pop();
                    magicLevels.poll();
                    teddy++;
                    sum = 0;
                } else if (sum == 250) {
                    String toy = "Wooden train";
                    giftXcount.putIfAbsent(toy, 0);
                    giftXcount.put(toy, giftXcount.get(toy) + 1);
                    materialStack.pop();
                    magicLevels.poll();
                    woodT++;
                    sum = 0;
                } else if (sum == 150) {
                    String toy = "Doll";
                    giftXcount.putIfAbsent(toy, 0);
                    giftXcount.put(toy, giftXcount.get(toy) + 1);
                    materialStack.pop();
                    magicLevels.poll();
                    doll++;
                    sum = 0;
                } else {
                    magicLevels.poll();
                    materialStack.push(materialStack.pop() + 15);
                }
            }
        }


        if (doll != 0 && woodT != 0 || bic != 0 && teddy != 0) {
            System.out.println("The presents are crafted! Merry Christmas!");

        } else {
            System.out.println("No presents this Christmas!");
        }

        if (!materialStack.isEmpty()) {
            String result = formatArrayDeque(materialStack);
            System.out.println("Materials left: " + result);


        }
        if (!magicLevels.isEmpty()) {
            String result = formatArrayDeque(magicLevels);
            System.out.println("Magic left: " + result);

        }

        for (Map.Entry<String, Integer> entry : giftXcount.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }

    public static String formatArrayDeque(ArrayDeque<Integer> deque) {
        if (deque.isEmpty()) {
            return "0";
        }
        return deque.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }


}
//materialStack --> push // pop()
// magiclevels -->  offer // poll



import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] elements = in.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(in.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);
        if (usedCoins == null) {
            System.out.println("Error");
        }

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        int currentSum = targetSum;
        int index = coins.length - 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        while (currentSum > 0 && index >= 0) {
            int coin = coins[index];
            if (currentSum - coin >= 0) {
                int coinsToRemove = currentSum / coin;
                currentSum = currentSum % coin;
                map.put(coin, coinsToRemove);

            }

            index = index - 1;
        }

        if (currentSum == 0) {
            return map;
        }

        return null;
    }
}
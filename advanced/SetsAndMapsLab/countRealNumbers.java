package SetsAndMapsLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();
        String inputLn = scanner.nextLine();
        String[] split = inputLn.split("\\s+");

        for (String el : split){
            Double dbl = Double.parseDouble(el);
            if (map.containsKey(dbl)){
                Integer previousVal = map.get(dbl);
                map.put(dbl , previousVal+1);
            }else {
                map.put(dbl, 1);
            }

        }


        for (Map.Entry<Double, Integer> doubleIntegerEntry : map.entrySet()) {
            System.out.println(String.format("%.1f -> %d",doubleIntegerEntry.getKey() , doubleIntegerEntry.getValue()));

        }

    }
}

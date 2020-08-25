package ExamTests;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MakeASalad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tomato	80
        //carrot	136
        //lettuce	109
        //potato	215
        ArrayDeque<Integer> salads = new ArrayDeque<>();
        HashMap<String, Integer> productsWithCals = new HashMap<String, Integer>();
        {
            productsWithCals.put("tomato", 80);
            productsWithCals.put("carrot", 136);
            productsWithCals.put("lettuce", 109);
            productsWithCals.put("potato", 215);
        }
        String[] vegetablesProds = scanner.nextLine().split("\\s+");
        ArrayDeque<String> listOfProds = new ArrayDeque<>();
        Collections.addAll(listOfProds, vegetablesProds);

        String[] caloriesSplitted = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> saladDeck = new ArrayDeque<>();
        for (String s : caloriesSplitted) {
            int cal = Integer.parseInt(s);
            saladDeck.push(cal);
        }

        while (!listOfProds.isEmpty() || !saladDeck.isEmpty()) {
            if (listOfProds.isEmpty()){
                break;
            }else if (saladDeck.isEmpty()){
                break;
            }
            int saladVal = 0;
            int salad = 0;
            try {

                saladVal = saladDeck.peek();
                salad = saladDeck.pop();
            } catch (NullPointerException ignored) {
            }

            while (salad >= 0) {
                String product = "";
                if (!listOfProds.isEmpty()) {
                    product = listOfProds.pop();
                } else {
                    salads.add(saladVal);
                    break;
                }
                int productCal = productsWithCals.get(product);
                if (salad - productCal <= 0) {
                    salads.add(saladVal);
                    break;
                } else {
                    salad -= productCal;
                }
            }
        }

        for (Integer salad : salads) {

                System.out.print(salad + " ");


        }
        System.out.println();
        if (listOfProds.isEmpty()) {
            for (Integer salad : saladDeck) {

                System.out.print(salad + " ");
            }
        }else if (saladDeck.isEmpty()){
            for (String prod : listOfProds) {
                System.out.print(prod + " ");
            }
        }

    }
}
 //90/100
package OOP.ReflectionAndAnnotations.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Field[] declaredfields = RichSoilLand.class.getDeclaredFields();
        while (!line.equals("HARVEST")) {

            for (Field declaredfield : declaredfields) {
                int modifier = declaredfield.getModifiers();
                String modifierAsString = Modifier.toString(modifier);

                if (modifierAsString.equals(line) || line.equals("all")) {
                    System.out.printf("%s %s %s%n", modifierAsString ,declaredfield.getType().getSimpleName(), declaredfield.getName());
                }
            }
            line = scanner.nextLine();
        }


    }


}

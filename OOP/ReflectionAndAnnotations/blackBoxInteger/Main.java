package OOP.ReflectionAndAnnotations.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BlackBoxInt blackBoxInt;
        try {
            Constructor<?> ctor = BlackBoxInt.class.getDeclaredConstructor(int.class);
            ctor.setAccessible(true);
            blackBoxInt = (BlackBoxInt) ctor.newInstance(0);


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        Map<String, Method> methodsByName = Arrays.stream(blackBoxInt.getClass().getDeclaredMethods())
                .collect(Collectors.toMap(Method::getName, m -> m));

        while (!input.equals("END")) {
            String[] splitted = input.split("_");
            String command = splitted[0];
            int param = Integer.parseInt(splitted[1]);

            Method method = methodsByName.get(command);
            method.setAccessible(true);

            method.invoke(blackBoxInt, param);

            Field result = BlackBoxInt.class.getDeclaredField("innerValue");
            result.setAccessible(true);
            int value = (int) result.get(blackBoxInt);

            System.out.println(value);

            input = scanner.nextLine();
        }
    }
}

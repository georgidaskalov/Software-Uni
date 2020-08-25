package ExamTests;

import java.util.*;

public class TheGarden {
    public static void main(String[] args) {
        //•	Lettuce  – 'L', Potatoes – 'P', Carrots  – 'C'
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            ArrayList<String> vegetableCol = new ArrayList<>(Arrays.asList(tokens));
            matrix.add(vegetableCol);
        }
        int harmedVeggie = 0;
        String input = scanner.nextLine();
        HashMap<String, Integer> veggieCount = new HashMap<>();

        int carrotsCount = 0;
        int potatosCount = 0;
        int lettuceCount = 0;

        while (!input.equals("End of Harvest")) {
            String[] tokens = input.split("\\s+");

            try {

                int row = Integer.parseInt(tokens[1]);
                int col = Integer.parseInt(tokens[2]);
                if (tokens[0].equals("Harvest")) {


                    if (matrix.get(row).get(col).contains("L")) {
                        setValue(matrix, row, col, " ");
                        lettuceCount++;

                    } else if (matrix.get(row).get(col).contains("P")) {
                        setValue(matrix, row, col, " ");
                        potatosCount++;

                    } else if (matrix.get(row).get(col).contains("C")) {
                        setValue(matrix, row, col, " ");
                        carrotsCount++;

                    }

                } else if (tokens[0].equals("Mole")) {
                    String direction = tokens[3];

                    if (direction.equals("up")) {
                        harmedVeggie = direction(matrix, row, col, direction, harmedVeggie);
                    } else if (direction.equals("down")) {
                        harmedVeggie = direction(matrix, row, col, direction, harmedVeggie);
                    } else if (direction.equals("left")) {
                        harmedVeggie = direction(matrix, row, col, direction, harmedVeggie);
                    } else if (direction.equals("right")) {
                        harmedVeggie = direction(matrix, row, col, direction, harmedVeggie);
                    }

                }
            } catch (IndexOutOfBoundsException ignore) {
            }

            input = scanner.nextLine();
        }


        printMatrix(matrix);
        System.out.printf("Carrots: %d%n" +
                "Potatoes: %d%n" +
                "Lettuce: %d%n",carrotsCount,potatosCount,lettuceCount);
        System.out.printf("Harmed vegetables: %d",harmedVeggie);


    }


    public static void setValue(ArrayList<ArrayList<String>> list, int row, int column, String value) {
        list.get(row).set(column, value);
    }

    private static void printMatrix(ArrayList<ArrayList<String>> matrix) {
        for (ArrayList<String> strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static Integer direction(ArrayList<ArrayList<String>> list, int row, int col, String direction, int harmedVeggie) {
        if (direction.equals("up")) {
            if (list.size() > row) {

                for (int i = row; i > 0; i -= 2) {
                    if (!list.get(i).get(col).equals(" ")){
                        setValue(list, i, col, " ");
                        harmedVeggie++;

                    }
                }
            }
        } else if (direction.equals("down")) {
            if (list.size() > row) {

                for (int i = row; i <= list.size(); i += 2) {
                    if (!list.get(i).get(col).equals(" ")){
                        setValue(list, i, col, " ");
                        harmedVeggie++;

                    }
                }
            }
        } else if (direction.equals("left")) {
            if (list.size() > row) {
                for (int i = col; i >= 0; i -= 2) {
                    if (!list.get(row).get(i).equals(" ")){
                        setValue(list, row, i, " ");
                        harmedVeggie++;
                    }

                }
            }
        } else if (direction.equals("right")) {
            if (list.size() > row) {
                for (int i = col; i < list.get(row).size(); i += 2) {
                    if (!list.get(row).get(i).equals(" ")){
                        setValue(list, row, i, " ");
                        harmedVeggie++;

                    }
                }
            }
        }
        return harmedVeggie;
    }

}


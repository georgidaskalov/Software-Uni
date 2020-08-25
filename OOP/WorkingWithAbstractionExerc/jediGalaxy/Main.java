package OOP.WorkingWithAbstractionExerc.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        Galaxy galaxy = new Galaxy(new Field(dimensions[0],dimensions[1]));


        String positions = scanner.nextLine();
        long starsPower = 0;
        while (!positions.equals("Let the Force be with you")) {

            int[] jediPositions = getJediPositions(positions);
            int[] sithPosition = getJediPositions(scanner.nextLine());
            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];

            int rowSith = sithPosition[0];
            int colSith = sithPosition[1];
            galaxy.moveSith(rowSith,colSith);

            starsPower += galaxy.moveJedi(rowJedi,colJedi);
            positions = scanner.nextLine();
        }

        System.out.println(starsPower);


    }



    private static int[] getJediPositions(String positions) {
        return Arrays.stream(positions.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

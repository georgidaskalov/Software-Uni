package advanced.DefiningClassesLab;

import java.util.Scanner;

public class Mainv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Car car = new Car();
        for (int i = 0; i < n ; i++) {
           String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];
            if (tokens.length == 1){
                car = new Car(brand);
            }else {

                String model = tokens[1];
                int hp = Integer.parseInt(tokens[2]);
                car = new Car(brand,model,hp);
            }


            System.out.println(car.getInfo());

        }




    }
}

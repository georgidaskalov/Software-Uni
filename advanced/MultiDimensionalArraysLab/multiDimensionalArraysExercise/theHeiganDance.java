package advanced.MultiDimensionalArraysLab.multiDimensionalArraysExercise;

import java.util.Scanner;

public class theHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerHealth = 18500;
        double bossHealth = 3000000;

        double damage = Double.parseDouble(scanner.nextLine());

        int[] playerPos = new int[2];
        playerPos[0] = 7;
        playerPos[1] = 7;
        String lastSpell = "";
        boolean isInCloud = false;


        while (playerHealth > 0) {
            bossHealth -= damage;


            if (isInCloud) {
                playerHealth -= 3500;
                isInCloud = false;
            }

            if (playerHealth <=0){
                lastSpell = "Cloud";
                break;
            }

            if (bossHealth <= 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            lastSpell = spell;
            boolean isPlayerDamage = checkPlayerIsHit(playerPos[0], playerPos[1], targetRow, targetCol);

            int damageDone = 0;
            if (isPlayerDamage) {
                if (spell.equals("Cloud")) {
                    damageDone = 3500;
                } else {
                    damageDone = 6000;
                }

                boolean canMove = playerCanMove(playerPos, targetRow, targetCol);

                if (!canMove) {
                    playerHealth -= damageDone;
                    if (spell.equals("Cloud")) {
                        isInCloud = true;
                    }
                }
            }

        }
        if (bossHealth > 0) {
            System.out.printf("Heigan: %.2f%n", bossHealth);
        }else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerHealth <= 0){

            lastSpell = lastSpell.equals("Cloud") ? "Plague Cloud" : lastSpell;
            System.out.printf("Player: Killed by %s%n", lastSpell);
        } else {

            System.out.printf("Player: %d%n", playerHealth);
        }
        System.out.println(String.format("Final position: %d, %d", playerPos[0], playerPos[1]));

    }

    private static boolean playerCanMove(int[] playerPos, int row, int col) {
        boolean canMove = false;
// up , right , down , left
        int r = playerPos[0];
        int c = playerPos[1];

        if (isInbounds(r - 1, c) && !checkPlayerIsHit(r - 1, c, row, col)) {
            r--;
            canMove = true;
        } else if (isInbounds(r, c + 1) && !checkPlayerIsHit(r, c + 1, row, col)) {
            c++;
            canMove = true;
        } else if (isInbounds(r + 1, c) && !checkPlayerIsHit(r + 1, c, row, col)) {
            r++;
            canMove = true;
        } else if (isInbounds(r, c - 1) && !checkPlayerIsHit(r, c - 1, row, col)) {
            c--;
            canMove = true;
        }

        playerPos[0] = r;
        playerPos[1] = c;

        return canMove;

    }

    private static boolean isInbounds(int r, int c) {
        return r >= 0 && r < 15 && c >= 0 && c < 15;
    }

    private static boolean checkPlayerIsHit(int r, int c, int targetRow, int targetCol) {
        return r >= targetRow - 1 && r <= targetRow + 1 &&
                c >= targetCol - 1 && c <= targetCol + 1;
    }
}

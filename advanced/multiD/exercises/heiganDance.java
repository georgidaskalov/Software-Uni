package multiD.exercises;

import java.util.Scanner;

public class heiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerHealth = 18500;
        double bossHealth = 3000000;

        double damage = Double.parseDouble(scanner.nextLine());

        int[] playerPos = new int[2];
        playerPos[0] = 7;
        playerPos[1] = 7;
        boolean isInCloud = false;
        String spellName = "";

        while (playerHealth > 0) {
            bossHealth -= damage;

            if (isInCloud) {
                playerHealth -= 3500;
                isInCloud = false;
            }
            if (playerHealth <= 0) {
                spellName = "Cloud";
                break;
            }
            if (bossHealth <= 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");
            String spell = tokens[0];
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            spellName = spell;
            boolean isPlayerDamage = checkPlayerIsHit(playerPos[0], playerPos[1], targetRow, targetCol);
            if (isPlayerDamage) {
                int damageDone = 0;
                if (spell.equals("Cloud")) {
                    damageDone = 3500;
                    spellName = spell;
                } else {
                    damageDone = 6000;
                    spellName = spell;
                }
                boolean canMove = playerCanMoveAndMovePlayer(playerPos, targetRow, targetCol);

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
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerHealth <= 0) {

            spellName = spellName.equals("Cloud") ? "Plague Cloud" : spellName;
            System.out.printf("Player: Killed by %s%n", spellName);
        } else if (bossHealth <= 0) {
            System.out.printf("Player: %d%n", playerHealth);
        }
        System.out.println(String.format("Final position: %d, %d", playerPos[0], playerPos[1]));

    }

    private static boolean playerCanMoveAndMovePlayer(int[] playerPos, int row, int col) {
        boolean canMove = true;
        int r = playerPos[0];
        int c = playerPos[1];
        if (r == row && c == col) {
            canMove = false;
        } else if (isInBounds(r - 1, c) && !checkPlayerIsHit(r - 1, c, row, col)) {
            r--;
        } else if (isInBounds(r, c + 1) && !checkPlayerIsHit(r, c + 1, row, col)) {
            c++;
        } else if (isInBounds(r + 1, c) && !checkPlayerIsHit(r + 1, c, row, col)) {
            r++;
        } else if (isInBounds(r, c - 1) && !checkPlayerIsHit(r, c - 1, row, col)) {
            c--;
        } else {
            canMove = false;
        }
        playerPos[0] = r;
        playerPos[1] = c;

        return canMove;
    }

    private static boolean isInBounds(int r, int c) {
        return r >= 0 && r < 15 && c >= 0 && c < 15;
    }

    private static boolean checkPlayerIsHit(int r, int c, int targetRow, int targetCol) {
        return r >= targetRow - 1 && r <= targetRow + 1 &&
                c >= targetCol - 1 && c <= targetCol + 1;
    }
}

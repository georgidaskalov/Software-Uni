package advanced.MultiDimensionalArraysLab;

import java.util.Scanner;

public class queens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[8][8];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
               // if (board[row][col] = 'q' && isValidQueen(row,col,board)) {

                    System.out.println(row + " " + col);
                }
            }
        }


   // }

    private static boolean isValidQueen(int row, int col, char[][] board) {
        for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
            for (int colDirection = -1; colDirection <= 1; colDirection++) {

                if (rowDirection == 0 && colDirection == 0){
                    continue;
                }

                int currentRow = row + rowDirection;
                int currentCol = col + colDirection;

                boolean validPosition = isValidPosition(board , currentRow ,currentCol);

                while (validPosition) {

                    if ('q' == board[currentRow][currentCol]) {
                        return false;
                    }

                    currentRow = currentRow + rowDirection;
                    currentCol = currentCol + colDirection;

                    validPosition = isValidPosition(board, currentRow, currentCol);
                }


            }
        }
        return true;
    }


    private static boolean isValidPosition(char[][] board, int currentRow, int currentCol) {
        boolean validPosition;
        validPosition = currentRow >= 0 && currentRow < board.length
                && currentCol >= 0 && currentCol < board[currentRow].length;
        return validPosition;
    }

}

//TOO LAZY TO FINISH
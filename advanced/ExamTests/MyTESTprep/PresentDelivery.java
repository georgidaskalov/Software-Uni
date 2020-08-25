package ExamTests.MyTESTprep;

import java.util.HashMap;
import java.util.Scanner;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];


        int[] position = new int[2];
        //if X naughty kid ,  if  V good kid  if C cookies empty pos is -

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            matrix[i] = line.toCharArray();
            if (line.contains("S")) {
                position[0] = i;
                position[1] = line.indexOf("S");
            }
        }
        String command = scanner.nextLine();
        int niceKidCounter = 0;
   //    while (!command.equalsIgnoreCase("Christmas morning")) {

   //        switch (command) {
   //            case "up":
   //                movePlayer(position[0] - 1, position[1], position, matrix,niceKidCounter,m);
   //                break;
   //            case "down":
   //                movePlayer(position[0] + 1, position[1], position, matrix,niceKidCounter,m);
   //                break;
   //            case "right":
   //                movePlayer(position[0], position[1] + 1, position, matrix,niceKidCounter,m);
   //                break;
   //            case "left":
   //                movePlayer(position[0], position[1] - 1, position, matrix,niceKidCounter,m);
   //                break;
   //        }

   //        command = scanner.nextLine();
   //    }
   //    printMatrix(matrix);
   //}


  //  private static HashMap<Integer,Integer> movePlayer(int newRow, int newCol, int[] position, char[][] matrix, int niceKidCounter, int m) {
  //      HashMap<String, Integer> presentsXgoodKids = new HashMap<>();
  //      presentsXgoodKids.putIfAbsent("presents", m);
  //      if (matrix[newRow][newCol] == 'V') {
  //          niceKidCounter++;
  //          presentsXgoodKids.putIfAbsent("kid", 0);
  //          presentsXgoodKids.put("kid",presentsXgoodKids.get("kid")+1);
  //          m--;
  //      }else if (matrix[newRow][newCol] == 'C'){
  //          matrix[newRow+1][newCol] = '-';
  //          matrix[newRow][newCol+1] = '-';
  //          matrix[newRow-1][newCol] = '-';
  //          matrix[newRow][newCol-1] = '-';
  //      }
//
  //      matrix[position[0]][position[1]] = '-';
  //      matrix[newRow][newCol] = 'S';
//
  //      position[0] = newRow;
  //      position[1] = newCol;
  //
//
  //  }

 //   private static boolean isOutOfBounds(char[][] matrix, int row, int col) {
 //       return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
 //   }
//
 //   private static void printMatrix(char[][] matrix) {
 //       for (int r = 0; r < matrix.length; r++) {
 //           for (int c = 0; c < matrix[r].length; c++) {
 //               System.out.print(matrix[r][c]);
 //           }
 //           System.out.println();
 //       }
    }
}
//broken AF
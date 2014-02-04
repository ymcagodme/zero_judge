import java.util.Scanner;

public class A015 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      do {
         int row = sc.nextInt();
         int col = sc.nextInt();
         int newRow = col;
         int newCol = row;
         int[][] transpose = new int[newRow][newCol];

         for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
               transpose[j][i] = sc.nextInt();
            }
         }

         for (int i = 0; i < newRow; ++i) {
            for (int j = 0; j < newCol; ++j) {
               if (j == newCol - 1)
                  System.out.println(transpose[i][j]);
               else
                  System.out.printf("%d ", transpose[i][j]);
            }
         }
      } while (sc.hasNext());
   }
}

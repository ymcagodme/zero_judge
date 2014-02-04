import java.util.Scanner;

public class A016 {
   static int[][] matrix = new int[9][9];

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
               matrix[i][j] = sc.nextInt();
            }
         }

         if (evaluateBig() && evaluateSmall())
            System.out.println("yes");
         else
            System.out.println("no");
      }
   }

   public static boolean evaluateSmall() {
      for (int k = 0; k < 9; k += 3) {
         int sum = 0;
         for (int row = k; row < k + 3; ++row) {
            for (int col = 0; col < 3; ++col) {
               sum += matrix[row][col];
            }
         }
         if (sum != 45) return false;
      }

      for (int k = 0; k < 9; k += 3) {
         int sum = 0;
         for (int row = k; row < k + 3; ++row) {
            for (int col = 3; col < 6; ++col) {
               sum += matrix[row][col];
            }
         }
         if (sum != 45) return false;
      }

      for (int k = 0; k < 9; k += 3) {
         int sum = 0;
         for (int row = k; row < k + 3; ++row) {
            for (int col = 3; col < 6; ++col) {
               sum += matrix[row][col];
            }
         }
         if (sum != 45) return false;
      }

      return true;
   }

   public static boolean evaluateBig() {
      for (int row = 0; row < 9; ++row) {
         int sum = 0;
         for (int col = 0; col < 9; ++col) {
            sum += matrix[row][col];
         }
         if (sum != 45) return false;
      }

      for (int col = 0; col < 9; ++col) {
         int sum = 0;
         for (int row = 0; row < 9; ++row) {
            sum += matrix[row][col];
         }
         if (sum != 45) return false;
      }

      return true;
   }
}

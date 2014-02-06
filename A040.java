import java.util.Scanner;
import java.util.ArrayList;

class A040 {
   public static int[][] powerTable = new int[7][10];
   public static void main(String[] args) {
      makeTable();
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int lowerBound = sc.nextInt();
         int upperBound = sc.nextInt();
         ArrayList<Integer> result = new ArrayList<Integer>();

         for (int i = lowerBound; i < upperBound; ++i) {
            if (isArmstrongNumber(i)) {
               result.add(new Integer(i));
            }
         }

         output(result);
      }
   }

   public static void makeTable() {
      for (int row = 0; row < 7; ++row) {
         for (int col = 0; col < 10; ++col) {
            powerTable[row][col] = (int) Math.pow(col, row);
         }
      }
   }

   public static void output(ArrayList<Integer> result) {
      if (result.size() > 0) {
         for (int i = 0; i < result.size(); ++i) {
            if (i != result.size() - 1)
               System.out.print(result.get(i) + " ");
            else
               System.out.println(result.get(i));
         }
      }
      else {
         System.out.println("none");
      }
   }

   public static boolean isArmstrongNumber(int input) {
      String tmp = String.format("%d", input);
      String[] numArray = tmp.split("(?!^)");
      int sum = 0;
      int num = 0;
      int power = numArray.length;
      for (int i = 0; i < power; ++i) {
         num = Integer.parseInt(numArray[i]);
         sum += powerTable[power][num];
      }

      if (input == sum)
         return true;
      return false;
   }
}

import java.util.Scanner;
import java.util.Arrays;

public class A054 {
   static char[] keys = new char[26];
   static int[] vals = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33};
   static int[] calculated = new int[vals.length];

   public static void main(String[] args) {
      makeKeysTable();
      makeCalculatedTable();

      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         possibleFirstLetter(sc.nextLine());
      }
   }

   public static void makeKeysTable() {
      for (int i = 65; i < 91; ++i) {
         keys[i - 65] = (char) i;
      }
   }

   public static void makeCalculatedTable() {
      for (int i = 0; i < calculated.length; ++i) {
         int units = vals[i] % 10;
         int tens = vals[i] / 10;
         calculated[i] = tens + units * 9;
      }
   }

   public static void possibleFirstLetter(String data) {
      char[] numbers = data.toCharArray();

      int sum = 0;
      for (int i = 0; i < numbers.length - 1; ++i) {
         sum += Integer.parseInt(String.format("%s", numbers[i])) * (8 - i);
      }
      sum += Integer.parseInt(String.format("%s", numbers[8]));

      for (int i = 0; i < calculated.length; ++i) {
         if ( (sum + calculated[i]) % 10 == 0)
            System.out.print(keys[i]);
      }
      System.out.println();
   }
}

import java.util.Scanner;
import java.util.Arrays;

public class A020 {
   static char[] keys = new char[26];
   static int[] vals = {10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33};

   public static void main(String[] args) {
      makeKeysTable();

      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         if (isValid(sc.nextLine()))
            System.out.println("real");
         else
            System.out.println("fake");
      }
   }

   public static void makeKeysTable() {
      for (int i = 65; i < 91; ++i) {
         keys[i - 65] = (char) i;
      }
   }

   public static boolean isValid(String data) {
      char[] id = data.toCharArray();
      int first = 0;
      for (int i = 0; i < keys.length; ++i) {
         if (keys[i] == id[0]) {
            first = vals[i];
            break;
         }
      }
      first = (first % 10) * 9 + (first / 10);

      int mid = 0;
      for (int i = 1; i < 9; ++i) {
         int tmp = Integer.parseInt(String.format("%s", id[i]));
         mid += tmp * (9 - i);
      }

      int last = Integer.parseInt(String.format("%s", id[9]));

      int sum = first + mid + last;
      if (sum % 10 == 0)
         return true;
      else
         return false;
   }
}

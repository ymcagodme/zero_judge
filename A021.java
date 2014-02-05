import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class A021 {
   public static void main(String[] args) {
      String test = "2222222222222222222222222 * 1111111111111111111111111";
      String a = "123";
      String b = "4308";
      StringBuilder sb = new StringBuilder(a);
      a = sb.reverse().toString();
      sb = new StringBuilder(b);
      b = sb.reverse().toString();

      String[] temp1 = a.split("(?!^)");
      String[] temp2 = b.split("(?!^)");

      int[] x = toIntArray(temp1);
      int[] y = toIntArray(temp2);


      if (x.length > y.length) {
         for (int i = 0; i < y.length; ++i) {
            int sum = x[i] + y[i];

         }
      }


      System.out.println(a);
      System.out.println(b);
   }

   public static int[] toIntArray(String[] s) {
      int[] result = new int[s.length];
      for (int i = 0; i < s.length; ++i) {
         result[i] = Integer.parseInt(s[i]);
      }

      return result;
   }

   public static String bigAdd(String a, String b) {


      return "";
   }
}

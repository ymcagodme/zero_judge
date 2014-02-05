import java.util.Scanner;

public class A020 {
   static String[] keys = new String[26];
   static String[] vals = new String[26];

   public static void main(String[] args) {
      String testID = "T112663836";

      for (int i = 65; i < 91; ++i) {
         keys[i - 65] = String.format("%s", (char) i);
      }

      for (int i = 10; i < 36; ++i) {

      }

      for (String s : keys) {
         System.out.println(s);
      }
   }

   public static boolean isValid(String id) {
      return false;
   }
}

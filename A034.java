import java.util.Scanner;

class A034 {
   public static void main(String[] args) {
      int count = 0;
      boolean flag = true;

      while (flag) {
         System.out.println(Math.pow(2, count));
         ++count;
         if (count > 10)
            flag = false;
      }
   }
}

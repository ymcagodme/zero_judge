import java.util.Scanner;

class A024 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         System.out.println(gcd(sc.nextInt(), sc.nextInt()));
      }
   }

   public static int gcd(int a, int b) {
      int x = Math.max(a, b);
      int y = Math.min(a, b);

      int remainder = x % y;
      if (remainder == 0)
         return y;
      else
         return gcd(y, remainder);
   }
}

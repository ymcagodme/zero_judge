import java.util.Scanner;

class A248 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int n = sc.nextInt();

         int integer = a / b;
         long remainder = (long) a % b;

         System.out.print(integer + ".");
         for (int i = 0; i < n; i++) {
            System.out.print(remainder * 10 / b);
            remainder = (remainder * 10) % b;
         }
         System.out.println();

      }
   }
}

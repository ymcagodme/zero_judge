import java.util.Scanner;

class A149 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int testCount = sc.nextInt();

      for (int i = 0; i < testCount; i++) {
         String[] digits = sc.next().split("(?!^)");
         long result = 1;
         for (int j = 0; j < digits.length; j++) {
            result *= Integer.parseInt(digits[j]);
         }
         System.out.println(result);
      }
   }
}

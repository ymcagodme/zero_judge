import java.util.Scanner;

class A053 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int correctCount = sc.nextInt();

         if (correctCount >= 40) {
            System.out.println(100);
         }
         else if (correctCount > 20) {
            System.out.println(60 + correctCount);
         }
         else if (correctCount > 10) {
            System.out.println(40 + 2 * correctCount);
         }
         else {
            System.out.println(correctCount * 6);
         }
      }
   }
}

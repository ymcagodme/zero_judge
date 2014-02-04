import java.util.Scanner;

public class D709 {
   public static void main(String[] argv) {
      Scanner sc = new Scanner(System.in);
      boolean isPrime = true;
      while(sc.hasNext()) {
         int input = sc.nextInt();
         if (input == 0) break;

         int upperBound = (int) Math.sqrt(input);

         for(int i = 2; i < upperBound; i += 2) {
            if(input % i == 0) {
               isPrime = false;
               break;
            }
         }

         if (isPrime)
            System.out.println(1);
         else
            System.out.println(0);
      }
   }
}

import java.util.Scanner;

public class A007 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while(sc.hasNext()) {
         int num = sc.nextInt();
         boolean isPrime = true;
         int upperBound = (int) Math.sqrt(num);

         for (int i = 2; i <= upperBound; ++i) {
            if (num % i == 0) {
               isPrime = false;
               break;
            }
         }
         if (isPrime)
            System.out.println("質數");
         else
            System.out.println("非質數");
      }
   }
}


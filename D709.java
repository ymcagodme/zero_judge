import java.util.Scanner;
import java.util.Arrays;

public class D709 {
   public static void main(String[] argv) {
      final int LIMIT = 1000000;
      final int limitSqrt = (int) Math.sqrt( (double) LIMIT);
      boolean[] primeTable = new boolean[LIMIT + 1];
      Arrays.fill(primeTable, false);

      primeTable[0] = false;
      primeTable[1] = false;
      primeTable[2] = true;
      primeTable[3] = true;

      for (int x = 0; x < limitSqrt; ++x) {
         for (int y = 0; y < limitSqrt; ++y) {
            int n = (4 * x * x) + (y * y);
            if (n <= LIMIT && (n % 12 == 1 || n % 12 == 5)) {
               primeTable[n] = !primeTable[n];
            }

            n = (3 * x * x) + (y * y);
            if (n <= LIMIT && (n % 12 == 7)) {
               primeTable[n] = !primeTable[n];
            }

            n = (3 * x * x) - (y * y);
            if ( (x > y) && (n <= LIMIT) && (n % 12 == 11) ) {
               primeTable[n] = !primeTable[n];
            }
         }
      }

      for (int n = 5; n < limitSqrt; ++n) {
         if (primeTable[n]) {
            int x = n * n;
            for (int i = x; i < LIMIT; i += x) {
               primeTable[x] = false;
            }
         }
      }

      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
         int input = sc.nextInt();
         if(input == 0) break;

         if(primeTable[input]) System.out.println(1);
         else System.out.println(0);
      }

      // Display all primes
      // for (int i = 0, j = 0; i <= LIMIT; ++i) {
      //    if (primeTable[i]) {
      //       System.out.printf("%8d", i);
      //       if (++j % 10 == 0)
      //          System.out.println();
      //       if (j % 100 == 0 )
      //          System.out.println();
      //    }
      // }




      // Sieve of Eratosthenes

      // final int LIMIT = 1000001;
      // boolean[] primeTable = new boolean[LIMIT];
      // for(int i = 0; i < LIMIT; ++i) {
      //    primeTable[i] = true;
      // }
      // primeTable[0] = primeTable[1] = false;

      // int upperBound = (int) Math.sqrt(LIMIT);
      // for (int i = 2; i < upperBound; ++i) {
      //    if(primeTable[i]) {
      //       for (int j = i * i; j < LIMIT; j += i) {
      //          primeTable[j] = false;
      //       }
      //    }
      // }

      // Scanner sc = new Scanner(System.in);
      // while(sc.hasNext()) {
      //    int input = sc.nextInt();
      //    if(input == 0) break;

      //    if(primeTable[input])
      //       System.out.println(1);
      //    else
      //       System.out.println(0);
      // }
   }
}

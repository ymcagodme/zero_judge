import java.util.Scanner;
import java.util.Arrays;

class A121 {
   static final int LIMIT = 100000000;
   static boolean[] primeTable = new boolean[LIMIT];
   public static void main(String[] args) {
      makePrimeTable();

      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int lowerBound = sc.nextInt();
         int upperBound = sc.nextInt();

         int counter = 0;
         for (int i = lowerBound; i <= upperBound; ++i) {
            if (primeTable[i])
               ++counter;
         }

         System.out.println(counter);
      }
   }

   public static void makePrimeTable() {
      int sqrt = (int) Math.sqrt(LIMIT);

      Arrays.fill(primeTable, true);
      primeTable[0] = primeTable[1] = false;

      int counter = 0;
      for (int i = 2; i < sqrt; ++i) {
         if (primeTable[i] == true) {
            for (int j = i + i; j < LIMIT; j += i)
               primeTable[j] = false;
         }
      }
   }
}

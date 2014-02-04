import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeSet;

public class A010 {
   final static int LIMIT = 1000000;
   static ArrayList<Integer> primeTable = new ArrayList<Integer>();
   static ArrayList<Integer> result = new ArrayList<Integer>();

   public static void main(String[] args) {
      makePrimeTable();

      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
         int num = sc.nextInt();
         result.clear();
         factor(num);
         TreeSet<Integer> resultSet = new TreeSet<Integer>(result);
         for (Integer i : resultSet) {
            int occurence = Collections.frequency(result, i);
            if(occurence > 1)
               System.out.printf("%d^%d", (int) i, occurence);
            else
               System.out.printf("%d", (int) i);

            // Handling the last element
            if(i != resultSet.last())
               System.out.print(" * ");
            else
               System.out.println();
         }
      }
   }

   public static void makePrimeTable(){
      boolean[] series = new boolean[LIMIT + 1];
      Arrays.fill(series, true);
      series[0] = series[1] = false;

      int upperbound = (int) Math.sqrt(LIMIT);

      for (int i = 2; i < upperbound; ++i) {
         if(series[i]) {
            for (int j = i * i; j < LIMIT; j += i) {
               series[j] = false;
            }
         }
      }

      for (int i = 0; i < LIMIT; ++i) {
         if(series[i]) primeTable.add(new Integer(i));
      }
   }

   public static void factor(int num) {
      if(primeTable.contains(new Integer(num))) {
         result.add(new Integer(num));
         return;
      }
      for(int i = 0; i < primeTable.size(); ++i) {
         int prime = (int) primeTable.get(i);
         if(num % prime == 0) {
            result.add(new Integer(prime));
            factor(num / prime);
            return;
         }
      }
   }
}

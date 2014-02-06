import java.util.Scanner;

class A059 {
   static int[] table = new int[1001];

   public static void main(String[] args) {
      makeTable();
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int dataAmount = sc.nextInt();
         for (int counter = 0; counter < dataAmount; ++counter) {
            int lowerBound = sc.nextInt();
            int upperBound = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < table.length; ++i) {
               if (table[i] < lowerBound)
                  continue;
               else if (table[i] > upperBound)
                  break;
               sum += table[i];
            }

            System.out.printf("Case %d: %d\n", counter + 1, sum);
         }
      }
   }

   public static void makeTable() {
      for (int i = 0; i < table.length; ++i) {
         table[i] = i * i;
      }
   }
}

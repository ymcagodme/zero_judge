import java.util.Scanner;

class A058 {
   static int[] table = new int[50000];

   public static void main(String[] args) {
      makeTable();
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int inputAmount = sc.nextInt();
         int k0 = 0;
         int k1 = 0;
         int k2 = 0;
         for (int i = 0; i < inputAmount; ++i) {
            int num = sc.nextInt();
            if (table[num] == 0)
               ++k0;
            else if (table[num] == 1)
               ++k1;
            else
               ++k2;
         }
         System.out.print(k0 + " ");
         System.out.print(k1 + " ");
         System.out.println(k2);
      }
   }

   public static void makeTable() {
      for (int i = 0; i < table.length; ++i) {
         table[i] = i % 3;
      }
   }
}

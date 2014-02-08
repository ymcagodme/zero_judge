import java.util.Scanner;

class A147 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int num = sc.nextInt();

         if (num == 0)
            break;

         for (int i = 1; i < num; ++i) {
            if (i % 7 == 0)
               continue;

            if (i == num - 1)
               System.out.println(i);
            else
               System.out.print(i + " ");
         }
      }
   }
}

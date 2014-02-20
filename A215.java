import java.util.Scanner;

class A215 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         int sum = n;
         int count = 1;

         while (sum <= m) {
            sum += (++n);
            count++;
         }

         System.out.println(count);
      }
   }
}

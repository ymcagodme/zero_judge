import java.util.Scanner;
import java.util.Arrays;

class A216 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         long n = sc.nextLong();

         long fn = (1 + n) * n / 2L;
         long gn = 0;

         for (long i = 1; i <= n; i++) {
            long fn_tmp = (1 + i) * i / 2L;
            gn += fn_tmp;
         }

         System.out.printf("%d %d\n", fn, gn);
      }
   }
}

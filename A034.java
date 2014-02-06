import java.util.Scanner;

class A034 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         int num = sc.nextInt();
         String ans = "";

         while ( num != 0 ) {
            ans = num % 2 + ans;
            num /= 2;
         }

         System.out.println(ans);
      }
   }
}

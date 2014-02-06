import java.util.Scanner;

class A034 {
   public static void main(String[] args) {
<<<<<<< HEAD
      int count = 0;
      boolean flag = true;

      while (flag) {
         System.out.println(Math.pow(2, count));
         ++count;
         if (count > 10)
            flag = false;
=======
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         int num = sc.nextInt();
         String ans = "";

         while ( num != 0 ) {
            ans = num % 2 + ans;
            num /= 2;
         }

         System.out.println(ans);
>>>>>>> 68ae127a06dd7bc9d48cd53aa4b0dc297b66f167
      }
   }
}

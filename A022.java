import java.util.Scanner;

class A022 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String original = sc.nextLine();
         StringBuilder sb = new StringBuilder(original);
         String reversed = sb.reverse().toString();

         if (original.equals(reversed))
            System.out.println("yes");
         else
            System.out.println("no");
      }
   }
}

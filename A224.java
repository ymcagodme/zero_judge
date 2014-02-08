import java.util.Scanner;

class A224 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String letters = sc.nextLine();
         letters = letters.toLowerCase();
         StringBuilder sb = new StringBuilder();

         char[] c = letters.toCharArray();

         for (int i = 0; i < c.length; ++i) {
            if ( (64 < (int) c[i] && (int) c[i] < 91) || (96 < (int) c[i] && (int) c[i] < 123) )
               sb.append(c[i]);
         }

         letters = sb.toString();
         if (letters.equals(sb.reverse().toString()))
            System.out.println("yes !");
         else
            System.out.println("no...");
      }
   }
}

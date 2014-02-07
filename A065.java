import java.util.Scanner;

class A065 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         char[] letters = sc.nextLine().toCharArray();
         for (int i = 0; i < letters.length - 1; ++i) {
            int distance = Math.abs((int) letters[i + 1] - (int) letters[i]);
            System.out.print(distance);
         }
         System.out.println();
      }
   }
}

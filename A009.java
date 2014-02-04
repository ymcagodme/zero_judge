import java.util.Scanner;

public class A009 {
   final static int shift = 7;
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      decode(sc.nextLine());
    }
   }

   public static void decode(String text) {
      for (int i = 0; i < text.length(); ++i) {
         int ascii = (int) text.charAt(i);
         ascii -= shift;
         System.out.printf("%s", (char) ascii);
      }
      System.out.println();
   }
}

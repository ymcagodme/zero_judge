import java.util.Scanner;

class A095 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int prisoner = sc.nextInt();
         int redHat = sc.nextInt();
         if (prisoner == redHat)
            System.out.println(redHat);
         else
            System.out.println(redHat + 1);
      }
   }
}

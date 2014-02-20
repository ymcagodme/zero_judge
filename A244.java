import java.util.Scanner;

class A244 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int testCount = sc.nextInt();
      for (int i = 0; i < testCount; i++) {
         int a = sc.nextInt();
         long b = sc.nextLong();
         long c = sc.nextLong();

         switch (a) {
            case 1:
               System.out.printf("%d\n", b + c);
               break;
            case 2:
               System.out.printf("%d\n", b - c);
               break;
            case 3:
               System.out.printf("%d\n", b * c);
               break;
            case 4:
               System.out.printf("%d\n", b / c);
         }
      }
   }
}

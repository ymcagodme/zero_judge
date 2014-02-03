import java.util.Scanner;

public class A006 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         
         double D = Math.pow(b, 2) - 4 * a * c;

         if(D == 0) {
            int root = (int) (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Two same roots x=" + root);
         }
         else if(D > 0) {
            int root1 = (int) (-b + Math.sqrt(D)) / (2 * a);
            int root2 = (int) (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("Two different roots x1=%d , x2=%d\n", root1, root2);
         }
         else {
            System.out.println("No real root");
         }
      }
   }
}


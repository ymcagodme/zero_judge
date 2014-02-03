import java.util.Scanner;

public class Submission {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNextLine()) {
         String[] cin = sc.nextLine().split(" ");
         int[] coef = new int[cin.length];
         for (int i = 0; i < cin.length; ++i) {
            coef[i] = Integer.parseInt(cin[i]);
         }

         double root1 = (-coef[1] + Math.sqrt( Math.pow(coef[1], 2) - 4 * coef[0] * coef[2] )) / 2 * coef[0];
         double root2 = (-coef[1] - Math.sqrt( Math.pow(coef[1], 2) - 4 * coef[0] * coef[2] )) / 2 * coef[0];
         // System.out.println("root 1 = " + root1);
         // System.out.println("root 2 = " + root2);
         if (root1 == root2) {
            System.out.println("Two same roots x=" + root1);
         }
         else if (Double.isNaN(root1) || Double.isNaN(root2)) {
            System.out.println("No real root");
         }
         else {
            if (root1 > root2) {
               System.out.printf("Two different roots x1=%.0f, x2=%.0f\n", root1, root2);
            }
            else {
               System.out.printf("Two different roots x1=%.0f, x2=%.0f\n", root2, root1);
            }
         }
      }
   }
}


import java.util.Scanner;

public class A007 {
   public static void main(String[] args) {
      final long LIMIT = 2147483647;



      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()) {
         int num = sc.nextInt();
         if (primeTable[num])
            System.out.println("質數");
         else
            System.out.println("非質數");
      }
   }
}


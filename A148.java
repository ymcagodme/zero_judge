import java.util.Scanner;

class A148 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int count = sc.nextInt();
         int sum = 0;
         for (int i = 0; i < count; i++) {
            sum += sc.nextInt();
         }
         double avg = (double) sum / count;
         if (avg > 59)
            System.out.println("no");
         else
            System.out.println("yes");
      }
   }
}

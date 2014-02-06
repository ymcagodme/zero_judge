import java.util.Scanner;

class A038 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String num = sc.nextLine();
         int temp = Integer.parseInt(num);
         num = String.format("%d", temp);

         String[] numArray = num.split("(?!^)");
         StringBuilder sb = new StringBuilder();

         for (int i = numArray.length - 1; i >= 0 ; --i) {
            sb.append(numArray[i]);
         }

         temp = Integer.parseInt(sb.toString());

         System.out.println(temp);
      }
   }
}

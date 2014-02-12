import java.util.Scanner;

class A225 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int length = sc.nextInt();
         int[] num = new int[length];

         for (int i = 0; i < length; i++) {
            num[i] = sc.nextInt();
         }

         boolean isChanged = true;

         while (isChanged == true) {
            isChanged = false;

            for (int i = 0; i < length; i++) {
               if (i == length - 1) continue;

               if (num[i] % 10 > num[i + 1] % 10) {
                  int tmp = num[i];
                  num[i] = num[i + 1];
                  num[i + 1] = tmp;
                  isChanged = true;
               }
               
               if (num[i] % 10 == num[i + 1] % 10 && num[i] < num[i + 1]) {
                  int tmp = num[i];
                  num[i] = num[i + 1];
                  num[i + 1] = tmp;
                  isChanged = true;
               }
            }
         }

         for (int i = 0; i < length - 1; i++) {
            System.out.printf("%d ", num[i]);
         }
         System.out.println(num[length -1]);
      }
   }
}

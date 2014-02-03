import java.util.Scanner;
import java.util.ArrayList;

public class Submission {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int numberOfSeries = sc.nextInt();
      int[][] series = new int[numberOfSeries][5];

      for (int count = 0; count < numberOfSeries; ++count) {
         for (int i = 0; i < 4; ++i) {
            series[count][i] = sc.nextInt();
         }

         if (series[count][1] - series[count][0] == series[count][2] - series[count][1]) {
            int delta = series[count][1] - series[count][0];
            series[count][4] = series[count][3] + delta;
         }
         else {
            int rate = series[count][1] / series[count][0];
            series[count][4] = series[count][3] * rate;
         }
      }

      for (int count = 0; count < numberOfSeries; ++count) {
         for (int num : series[count]) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
   }
}


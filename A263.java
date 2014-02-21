import java.util.Scanner;
import java.util.Arrays;

class A263 {
   static int[] monthlyDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   static boolean[] leapYear = new boolean[10000];

   public static void main(String[] args) {
      makeTable();
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
         Date date1 = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());
         Date date2 = new Date(sc.nextInt(), sc.nextInt(), sc.nextInt());


         int diff = Math.abs(toDays(date1) - toDays(date2));
         System.out.println(diff);
      }
   }

   public static int toDays(Date date) {
         int days = 0;

         for (int i = 1; i < date.year; i++) {
            if (leapYear[i])
               days += 366;
            else
               days += 365;
         }

         for (int i = 1; i < date.month; i++) {
            if (i == 2 && isLeapYear(date.year))
               days += 29;
            else
               days += monthlyDays[i];
         }

         days += date.day;
         return days;
   }

   public static void makeTable() {
      Arrays.fill(leapYear, false);

      for (int i = 1; i < leapYear.length; i++) {
         if (isLeapYear(i))
            leapYear[i] = true;
      }
   }

   public static boolean isLeapYear(int year) {
      if (year % 400 == 0)
         return true;
      else if (year % 100 == 0)
         return false;
      else if (year % 4 == 0)
         return true;
      return false;
   }
}

class Date {
   public int year;
   public int month;
   public int day;

   public Date(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}

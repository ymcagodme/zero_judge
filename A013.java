import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class A013 {
   final static char[] romanLetters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
   final static int[] romanNumbers = {1, 5, 10, 50, 100, 500, 1000};
   final static int[] fundamentalElem = {9, 5, 4, 1};
   static ArrayList<Integer> elems = new ArrayList<Integer>();

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while(sc.hasNext()) {
         String s1 = sc.next();
         if (s1.equals("#"))
            return;

         String s2 = sc.next();
         int n1 = romanToInt(s1);
         int n2 = romanToInt(s2);
         int diff = Math.abs(n1 - n2);
         if (diff == 0)
            System.out.println("ZERO");
         else
            System.out.println(intToRoman(diff));
      }
   }

   public static int romanToInt(String romanString) {
      int length = romanString.length();
      int[] temp = new int[length];
      for (int i = 0; i < length; ++i) {
         switch (romanString.charAt(i)) {
            case 'I':
               temp[i] = 1;
               break;
            case 'V':
               temp[i] = 5;
               break;
            case 'X':
               temp[i] = 10;
               break;
            case 'L':
               temp[i] = 50;
               break;
            case 'C':
               temp[i] = 100;
               break;
            case 'D':
               temp[i] = 500;
               break;
            case 'M':
               temp[i] = 1000;
         }
      }

      for (int i = 0; i < length; ++i) {
         if (i == length - 1)
            break;
         if(temp[i] < temp[i + 1])
            temp[i] = -temp[i];
      }

      int sum = 0;
      for (int i = 0; i < length; ++i) {
         sum += temp[i];
      }

      return sum;
   }

   public static String intToRoman(int num) {
      String romanString = "";
      int units = num % 10;
      int tens = (num / 10) % 10;
      int hundreds = (num / 100) % 10;
      int thousands = (num / 1000) % 10;

      for (int i = 0; i < thousands; ++i)
         romanString += "M";

      elems.clear();
      expandNumber(hundreds);
      for (int i = 0; i < elems.size(); i++) {
         switch ((int) elems.get(i)) {
            case 1:
               romanString += "C";
               break;
            case 4:
               romanString += "CD";
               break;
            case 5:
               romanString += "D";
               break;
            case 9:
               romanString += "CM";
         }
      }

      elems.clear();
      expandNumber(tens);
      for (int i = 0; i < elems.size(); i++) {
         switch ((int) elems.get(i)) {
            case 1:
               romanString += "X";
               break;
            case 4:
               romanString += "XL";
               break;
            case 5:
               romanString += "L";
               break;
            case 9:
               romanString += "XC";
         }
      }

      elems.clear();
      expandNumber(units);
      for (int i = 0; i < elems.size(); i++) {
         switch ((int) elems.get(i)) {
            case 1:
               romanString += "I";
               break;
            case 4:
               romanString += "IV";
               break;
            case 5:
               romanString += "V";
               break;
            case 9:
               romanString += "IX";
         }
      }

      return romanString;
   }

   public static void expandNumber(int num) {
      if(num == 0)
         return;
      for(int i = 0; i < fundamentalElem.length; ++i) {
         if(num >= fundamentalElem[i]) {
            elems.add(new Integer(fundamentalElem[i]));
            expandNumber(num - fundamentalElem[i]);
            return;
         }
      }
   }
}

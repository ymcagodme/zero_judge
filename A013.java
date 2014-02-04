import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class A013 {
   static char[] romanLetters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
   static int[] romanNumbers = {1, 5, 10, 50, 100, 500, 1000};
   static ArrayList<Character> resultChar = new ArrayList<Character>();

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println(romanToInt("MCMXCVIII"));
      intToRawRoman(1998);
      for (Character c : resultChar) {
         System.out.print(c);
      }
   }

   public static int romanToInt(String romanString) {
      int sum = 0;
      int[] temp = new int[romanString.length()];
      for(int i = 0; i < romanString.length(); ++i) {
         temp[i] = romanNumbers[ findIndexOfRomanLetters(romanString.charAt(i)) ];
      }

      for(int i = 0; i < romanString.length(); ++i) {
         if(i < romanString.length() - 1){
            if(temp[i] < temp[i + 1])
               temp[i] = -temp[i];
         }
      }

      for(int i = 0; i < romanString.length(); ++i) {
         sum += temp[i];
      }

      return sum;
   }

   public static int findIndexOfRomanLetters(char c) {
      for(int i = 0; i < romanLetters.length; ++i) {
         if(c == romanLetters[i])
            return i;
      }
      return -1;
   }

   public static void intToRawRoman(int num) {
      if(num == 1) {
         resultChar.add(new Character('I'));
         return;
      }

      for(int i = 0; i < romanNumbers.length; ++i) {
         int reverseIndex = romanNumbers.length - i - 1;
         if(num > romanNumbers[reverseIndex]) {
            resultChar.add(new Character(romanLetters[reverseIndex]));
            intToRawRoman(num - romanNumbers[reverseIndex]);
            return;
         }
      }
   }

   public static void simplifyRomam() {
      for(int i = 0; i < resultChar.size(); ++i) {
         if(Collections.frequency(resultChar, new Character()) == 4) {

         }
      }
   }
}

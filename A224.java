import java.util.Scanner;
import java.util.HashMap;

class A224 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String letters = sc.nextLine();
         letters = letters.toLowerCase();
         StringBuilder sb = new StringBuilder();

         char[] c = letters.toCharArray();

         for (int i = 0; i < c.length; ++i) {
            if ( (64 < (int) c[i] && (int) c[i] < 91) || (96 < (int) c[i] && (int) c[i] < 123) )
               sb.append(c[i]);
         }

         c = sb.toString().toCharArray();

         if (isValidPalindrome(c))
            System.out.println("yes !");
         else
            System.out.println("no...");

      }
   }

   public static boolean isValidPalindrome(char[] c) {
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();

      for (int i = 0; i < c.length; ++i) {
         char val = c[i];
         if (!map.containsKey(new Character(val))) {
            int count = 0;
            for (int j = i; j < c.length; ++j) {
               if (c[j] == val)
                  ++count;
            }
            map.put(new Character(val), new Integer(count));
         }
      }

      int length = c.length;
      Integer[] values = map.values().toArray(new Integer[map.size()]);
      boolean isValid = true;
      if (length % 2 == 0) {
         for (int i = 0; i < values.length; ++i) {
            if (values[i] % 2 != 0) {
               isValid = false;
               break;
            }
         }
      }
      else {
         int oddCount = 0;
         for (int i = 0; i < values.length; ++i) {
            if (oddCount > 1) {
               isValid = false;
               break;
            }
            if (values[i] % 2 != 0)
               ++oddCount;
         }
      }

      return isValid;
   }
}

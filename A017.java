import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class A017 {
   static Stack stack = new Stack();
   static Stack result = new Stack();
   static StringBuilder sb;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String[] infix = sc.nextLine().split(" ");
         convertToPostfix(infix);
         String[] postfix = sb.toString().split("(?!^)");
         for (int i = 0; i < postfix.length; i++) {
            calculate(postfix[i]);
         }
         System.out.println(result.pop());
      }
   }

   public static void convertToPostfix(String[] infix) {
      sb = new StringBuilder();

      for (int i = 0; i < infix.length; i++) {
         switch (infix[i]) {
            case "(":
               stack.push("(");
               break;

            case "%":
            case "*":
            case "/":
            case "+":
            case "-":
               if (stack.isEmpty() == false && getPriority((String) stack.peek()) > getPriority(infix[i])) {
                  sb.append(stack.pop());
               }
               stack.push(infix[i]);
               break;

            case ")":
               String s;
               while ( (s = (String) stack.pop()).equals("(") == false ) {
                  sb.append(s);
               }
               break;

            default:
               sb.append(infix[i]);
         }
      }
      while (stack.isEmpty() == false)
         sb.append(stack.pop());
   }

   public static int getPriority(String op) {
      switch (op) {
         case "%":
            return 3;

         case "*":
         case "/":
            return 2;

         case "+":
         case "-":
            return 1;

         default:
            return 0;
      }
   }

   public static void calculate(String s) {
      int a;
      int b;
      switch (s) {
         case "%":
            a = (int) result.pop();
            b = (int) result.pop();
            result.add(b % a);
            break;
         case "*":
            a = (int) result.pop();
            b = (int) result.pop();
            result.add(b * a);
            break;
         case "/":
            a = (int) result.pop();
            b = (int) result.pop();
            result.add(b / a);
            break;
         case "+":
            a = (int) result.pop();
            b = (int) result.pop();
            result.add(b + a);
            break;
         case "-":
            a = (int) result.pop();
            b = (int) result.pop();
            result.add(b - a);
            break;
         default:
            result.push(Integer.parseInt(s));
      }
   }
}

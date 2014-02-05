import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A017 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      ArrayList<String> test = new ArrayList<String>();
      test.add("4");
      test.add("*");
      test.add("(");
      test.add("2");
      test.add("+");
      test.add("3");
      test.add(")");
      test.add("/");
      test.add("2");

      for (String s : test) {
         System.out.print(s);
      }
      System.out.println();
      List<String> subList;
      for (int i = 0; i < test.size(); ++i) {
         if (test.get(i).equals("(")) {
            int endIndex = test.indexOf(")");
            subList = test.subList(i, endIndex + 1);
            test.removeAll(subList);
            break;
         }
      }
      for (String s : subList) {
         System.out.print(s);
      }
      System.out.println();

      for (String s : test) {
         System.out.print(s);
      }
      System.out.println();

      List<String> testList = new ArrayList<String>();
      testList.add("5");

      test.addAll(2, testList);

      for (String s : test) {
         System.out.print(s);
      }
      System.out.println();
   }

   // public static List<String> calculate(List<String> expression) {
   //    if (expression.size() == 3) {
   //       ArrayList<String> result = new ArrayList<String>();
   //       int a = Integer.parseInt(expression.get(0));
   //       int b = Integer.parseInt(expression.get(2));
   //       switch (expression.get(1)) {
   //          case "%":
   //             result.add(String.format("%d", a % b));
   //             break;
   //          case "*":
   //             result.add(String.format("%d", a * b));
   //             break;
   //          case "/":
   //             result.add(String.format("%d", a / b));
   //             break;
   //          case "+":
   //             result.add(String.format("%d", a + b));
   //             break;
   //          case "-":
   //             result.add(String.format("%d", a - b));
   //       }
   //       return result;
   //    }

   //    for (int i = 0; i < expression.size(); ++i) {
   //       switch (expression.get(i)) {
   //          case "(":
   //             int endIndex = expression.indexOf(")");
   //             List<String> subList = expression.subList(i, endIndex + 1);
   //             expression.removeAll(subList);
   //             subList.remove(0);
   //             subList.remove(subList.size() - 1);
   //             expression.addAll(i, calculate(subList));
   //             break;
   //          case "%":
   //             List<String> subList = expression.subList(i - 1, i + 2);
   //             expression.removeAll(subList);
   //             expression.addAll(i - 1, calculate(subList));
   //             break;

   //       }
   //    }
   // }
}

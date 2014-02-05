import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class A017 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String[] line = sc.nextLine().split(" ");
         List<String> expression = new ArrayList<String>();
         Collections.addAll(expression, line);
         while (expression.size() != 1) {
            expression = calculate(expression);
         }
         System.out.println(expression.get(0));
      }
   }

   public static List<String> calculate(List<String> expression) {
      if (expression.size() == 3) {
         ArrayList<String> result = new ArrayList<String>();
         int a = Integer.parseInt(expression.get(0));
         int b = Integer.parseInt(expression.get(2));
         if (expression.get(1).equals("%")) {
            result.add(String.format("%d", a % b));
            return result;
         }
         else if (expression.get(1).equals("*")) {
            result.add(String.format("%d", a * b));
            return result;
         }
         else if (expression.get(1).equals("/")) {
            result.add(String.format("%d", a / b));
            return result;
         }
         else if (expression.get(1).equals("+")) {
            result.add(String.format("%d", a + b));
            return result;
         }
         else if (expression.get(1).equals("-")) {
            result.add(String.format("%d", a - b));
            return result;
         }
      }

      List<String> subList;
      List<String> reducedList;
      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("(")) {
               int endIndex = expression.indexOf(")");
               subList = expression.subList(i, endIndex + 1);
               subList.remove(0);
               subList.remove(subList.size() - 1);
               reducedList = calculate(subList);
               subList.clear();
               expression.addAll(i, reducedList);
               return expression;
         }
      }

      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("%")) {
            subList = expression.subList(i - 1, i + 2);
            reducedList = calculate(subList);
            subList.clear();
            expression.addAll(i - 1, reducedList);
            return expression;
         }
      }

      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("*")) {
            subList = expression.subList(i - 1, i + 2);
            reducedList = calculate(subList);
            subList.clear();
            expression.addAll(i - 1, reducedList);
            return expression;
         }
      }

      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("/")) {
            subList = expression.subList(i - 1, i + 2);
            reducedList = calculate(subList);
            subList.clear();
            expression.addAll(i - 1, reducedList);
            return expression;
         }
      }

      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("+")) {
            subList = expression.subList(i - 1, i + 2);
            reducedList = calculate(subList);
            subList.clear();
            expression.addAll(i - 1, reducedList);
            return expression;
         }
      }

      for (int i = 0; i < expression.size(); ++i) {
         if (expression.get(i).equals("-")) {
            subList = expression.subList(i - 1, i + 2);
            reducedList = calculate(subList);
            subList.clear();
            expression.addAll(i - 1, reducedList);
            return expression;
         }
      }

      return expression;
   }
}

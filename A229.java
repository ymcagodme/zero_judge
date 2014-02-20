import java.util.Scanner;

class A229 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int n = sc.nextInt();
         dfs(n, n, new StringBuilder());
      }
   }

   public static void dfs(int n, int m, StringBuilder str) {
      if (n == 0) {
         for (; m > 0; m--) {
            str.append(")");
         }
         System.out.println(str);
         return;
      }

      if (n < m) {
         dfs(n - 1, m, new StringBuilder(str).append("("));
         dfs(n, m - 1, new StringBuilder(str).append(")"));
      }
      else if (n == m) {
         dfs(n - 1, m, new StringBuilder(str).append("("));
      }
   }
}

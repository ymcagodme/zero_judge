import java.util.Scanner;

class A229 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int n = sc.nextInt();
         dfs(n, n, "");
         System.out.println();
      }
   }

   public static void dfs(int n, int m, String str) {
      if (n == 0) {
         for (; m > 0; m--) {
            str += ")";
         }
         System.out.println(str);
         return;
      }

      if (n < m) {
         dfs(n - 1, m, str + "(");
         dfs(n, m - 1, str + ")");
      }
      else if (n == m) {
         dfs(n - 1, m, str + "(");
      }
   }
}

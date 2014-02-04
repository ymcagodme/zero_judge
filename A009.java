import java.util.Scanner;

public class A009 {
   public static void main(String[] args) {
      final String plain_text = "*CDC is the trademark of the Control Data Corporation.";
      final String encoded_text = "1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5";
   }

   public static void printASCII(String text) {
      for (int i = 0; i < text.length(); ++i) {
         System.out.printf("%d ", text.charAt(i));
      }
   }
}

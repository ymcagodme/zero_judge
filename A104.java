import java.util.Scanner;

class A104 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         int length = sc.nextInt();
         int[] a = new int[length];
         for (int i = 0; i < length; ++i) {
            a[i] = sc.nextInt();
         }

         a = mergeSort(a);

         for (int i = 0; i < a.length - 1; ++i) {
            System.out.print(a[i] + " ");
         }
         System.out.println(a[a.length - 1]);
      }
   }

   public static int[] mergeSort(int[] array) {
      if (array.length == 1) {
         return array;
      }

      int[] left = new int[array.length / 2];
      int[] right = new int[array.length - left.length];

      for (int i = 0; i < left.length; ++i)
         left[i] = array[i];

      for (int i = 0; i < right.length; ++i)
         right[i] = array[i + left.length];

      left = mergeSort(left);
      right = mergeSort(right);

      int[] result = new int[array.length];

      int leftHead = 0;
      int rightHead = 0;
      int counter = 0;
      while (leftHead < left.length && rightHead < right.length) {
         if (left[leftHead] < right[rightHead]) {
            result[counter] = left[leftHead];
            ++leftHead;
         }
         else {
            result[counter] = right[rightHead];
            ++rightHead;
         }
         ++counter;
      }

      if (leftHead == left.length) {
         for (int i = rightHead; i < right.length; ++i) {
            result[counter] = right[i];
            ++counter;
         }
      }
      else if (rightHead == right.length){
         for (int i = leftHead; i < left.length; ++i) {
            result[counter] = left[i];
            ++counter;
         }
      }

      return result;
   }
}

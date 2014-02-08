import java.util.Scanner;
import java.util.Arrays;

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

   // Dual-pivot quick sort
   public static int[] buildinSort(int[] array) {
      Arrays.sort(array);
      return array;
   }

   public static void quickSort(int[] array, int beginIndex, int length) {
      if (length <= 1)
         return;

      final int endIndex = beginIndex + length - 1;

      // Select Pivot
      final int pivotPosition = beginIndex + length / 2;
      final int pivotValue = array[pivotPosition];
      swap(array, pivotPosition, endIndex);

      // Partitioning
      int ptr = beginIndex;
      for (int i = beginIndex; i < endIndex; ++i) {
         if (array[i] < pivotValue)
            swap(array, i, ptr++);
      }
      swap(array, ptr, endIndex);

      quickSort(array, beginIndex, ptr - beginIndex);
      quickSort(array, ptr + 1, endIndex - ptr);
   }

   public static void swap(int[] arr, int src, int dst) {
      int temp = arr[src];
      arr[src] = arr[dst];
      arr[dst] = temp;
   }

   public static int[] mergeSort(int[] array) {
      if (array.length == 1)
         return array;

      int half = array.length / 2;
      int[] left = new int[half];
      int[] right = new int[array.length - left.length];

      System.arraycopy(array, 0, left, 0, left.length);
      System.arraycopy(array, half, right, 0, right.length);

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

      for (int i = rightHead; i < right.length; ++i) {
         result[counter++] = right[i];
      }

      for (int i = leftHead; i < left.length; ++i) {
         result[counter++] = left[i];
      }

      return result;
   }
}

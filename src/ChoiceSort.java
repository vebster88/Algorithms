import java.lang.reflect.Array;
import java.util.Arrays;

public class ChoiceSort {

    public static void main(String[] args) {
        int[] arrays = {5, 7, 2, 10, 16, 345, 2};

        System.out.println(Arrays.toString(selectionSort(arrays)));
    }



 public static Integer findSmallest(int[] arr)
 {
    int smallest = arr[0];
    int smallestIndex = 0;
    for (int i=1; i<arr.length; i++) {

        if (arr[i] < smallest) {
        smallest = arr[i];
        smallestIndex = i;
        }
    }
     return smallestIndex;
 }

 public static int[] selectionSort(int[] arr) {
     int smallest;
     int[] newArr = new int[arr.length];
     for (int i=0; i<arr.length; i++) {
         smallest = findSmallest(arr);
         newArr[i] = arr[smallest];
         arr = deleteSmallest(arr,smallest);
     }
     return newArr;
 }

 public static int[] deleteSmallest(int[] arr, int smallest) {
        int[] newArr = new int[arr.length-1];
     int j=0;
        for (int i=0; i<arr.length-1; i++) {

            if (i == smallest) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
return newArr;
 }

}

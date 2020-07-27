import java.lang.reflect.Array;
import java.util.ArrayList;

public class selectionSortArray {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 14, 56, 23, 7, 23, 1, 10, 123213};
        Integer[] arr1 = selectionSort(arr);
for (Integer par: arr1) {
    System.out.println(par);
}
    }

    public static Integer findSmallest(Integer[] arr) {
        Integer smallest = arr[0];
        Integer smallest_index = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    public static Integer[] selectionSort(Integer[] arr) {
        Integer[] newArr = new Integer[arr.length];
        int smallest;
        int length = arr.length;
        for (int i=0; i<length; i++) {
            smallest = findSmallest(arr);
            newArr[i] = arr[smallest];
            Integer[] arr1 = new Integer[arr.length-1];
            int o = 0; int k=0;
            for (int in=0; in<arr.length;in++) {

                if ((arr[in] == arr[smallest])&&(k==0)) {
                    k++;
                    continue;
                } else {
                    arr1[o] = arr[in];
                    o++;
                }

            }
            arr = arr1;
        }
        return newArr;
    }
}

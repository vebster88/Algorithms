import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(1, 3, 6, 12, 3, 2, 4, 1, 5, 7, 8, 9, 10, 11, 2));
        System.out.println(quicksort(arr));

    }

    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        ArrayList<Integer> arrless = new ArrayList<>();
        ArrayList<Integer> arrgreater = new ArrayList<>();
        if (arr.size() < 2) {
            return arr;
        } else {
            int pivot = arr.get(0);
            for (int i=1; i<arr.size(); i++) {
                if (pivot >= arr.get(i)) {
                    arrless.add(arr.get(i));
                }
                if (pivot < arr.get(i)) {
                    arrgreater.add(arr.get(i));
                }
            }
            return arrSum(quicksort(arrless), pivot, quicksort(arrgreater));

            }
        }

    public static ArrayList<Integer> arrSum(ArrayList<Integer> arrless, Integer pivot, ArrayList<Integer> arrgreater) {
        arrless.add(pivot);
        for (int i = 0; i < arrgreater.size(); i++) {
            arrless.add(arrgreater.get(i));

        }
        return arrless;
    }




}




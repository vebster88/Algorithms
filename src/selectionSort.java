import java.util.ArrayList;
import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(1, 32, 13, 56, 6));
        System.out.println(selectionSort(arr));
    }
    public static int findSmallest(ArrayList<Integer> arr) {
        int smallest = arr.get(0);
        Integer smallest_index = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        int smallest;
        ArrayList<Integer> newArr = new ArrayList<>();
        int arraySize = arr.size();
        for (int i=0; i<arraySize;i++) {
            smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));
            arr.remove(smallest);
        }

        return newArr;
    }


}

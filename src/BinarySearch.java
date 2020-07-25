import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<1000; i++) {
            list.add(i);
        }
            BinarySearch n = new BinarySearch();
            n.search(list, 455);





    }

    public void search(ArrayList<Integer> list, int index) {
        int min = 0;
        int max = list.size();
        for (int i=0; true;i++) {
            if (index == (max+min)/2) {
                System.out.println("Загаданное число - " + index + " ,количество шагов:" + i);
                break;
            }
            if (index > (max+min)/2) {
                min = (max+min)/2;
            }
            if ( (index < (max+min)/2)) {
                max = (max+min)/2;
            }
        }

    }
}

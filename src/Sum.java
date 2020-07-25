public class Sum {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 7, 10, 12, 1, 4, 34 , 56};
        System.out.println("Сумма чисел массива: " + sumArr(arr));
        System.out.println("Количество элементов в списке: " + sumOfNum(arr));


    }

//    public static int sumArr(Integer[] arr) {
//        int sum = 0;
//        for (int i=0; i<arr.length; i++) {
//            sum = sum + arr[i];
//        }
//
//       return sum;
//    }

    public static int sumArr(Integer[] arr) {
        int sum = arr[0];


        if (arr.length == 0||arr.length ==1) {
            return sum;
        } else {
            Integer[] arr1 = new Integer[arr.length-1];
            for (int i=1; i<arr.length; i++) {
                arr1[i-1] = arr[i];
            }
            sum = sum + sumArr(arr1);
        }
        return sum;

    }

    public static int sumOfNum(Integer[] arr) {
        int sum = 1;
        if (arr.length == 0||arr.length ==1) {
            return sum;
        } else {
            Integer[] arr1 = new Integer[arr.length-1];
            for (int i=1; i<arr.length; i++) {
                arr1[i-1] = arr[i];
            }
            sum = sum + sumOfNum(arr1);
        }


    return sum;
    }

}

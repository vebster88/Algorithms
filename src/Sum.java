public class Sum {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 7, 10, 12};
        System.out.println(sumArr(arr));


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
            for (int i=1;i<arr.length;i++) {
                arr1[i-1] = arr[i];
            }
            sum = sum + sumArr(arr1);
        }
        return sum;

    }

}

public class Factorial {
    public static void main(String[] args) {
        int i = 2;
        System.out.println(factorial(i));




    }

    public static long factorial(int i) {

        if (i==0) {
            return 1;
        }
        else return i*factorial(i-1);
    }


}

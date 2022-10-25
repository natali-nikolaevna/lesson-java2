public class HomeWork {
    public static void main(String[] args) {
        System.out.println(within10and20(10, 20));
        isPositiveOrNegative(10);
        System.out.println (isNegative(8));
        printWordNTimes("Hello word", 10);

    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegative(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean isNegative(int d) {
        if (d >= 0) {
            return true;
        }
        return false;
    }
     public static void printWordNTimes (String word, int t ){
        for ( t=0; t<10; t++) {
            System.out.println(word);
        }
     }


}




package calculator;

public class MyMaths {
    public static int addUp(int a, int b) {
        int total = a + b;
        System.out.printf("Total of %d + %d is: %d\n", a, b, total);
//        System.out.println("Blank Line");
        return total;
    }

    public static int subtractAway(int a, int b) {
        int total = a - b;
        System.out.printf("Total of %d - %d is: %d\n", a, b, total);
        return total;
    }
}

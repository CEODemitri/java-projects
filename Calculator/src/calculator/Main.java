package calculator;

import java.util.Scanner;

import static calculator.MyMaths.addUp;
import static calculator.MyMaths.subtractAway;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Number 1: ");
        int firstNum = num.nextInt();

        System.out.println("Number 2: ");
        int secondNum = num.nextInt();

        int result = addUp(firstNum, secondNum);
        int work = subtractAway(firstNum, secondNum);

        num.close();

        System.out.println("Coming from Main!");
    }
}

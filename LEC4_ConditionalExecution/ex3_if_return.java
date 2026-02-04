package LEC4_ConditionalExecution;

import java.util.Scanner;

public class ex3_if_return {

    public static int findMaxNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Max number: " + findMaxNumber(a, b));
    }
}

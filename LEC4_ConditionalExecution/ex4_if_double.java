package LEC4_ConditionalExecution;

import java.util.Scanner;

public class ex4_if_double {

    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double a = scanner.nextInt();
        System.out.print("y: ");
        double b = scanner.nextInt();
        System.out.print("quadrant: " + quadrant(a, b));
    }
}

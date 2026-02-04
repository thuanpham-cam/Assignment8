package LEC6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3_outSoLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();
        System.out.print("nhap so ptu trong mang: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap so nguyen thu " + (i + 1) + ": ");
            mang.add(sc.nextInt());
        }
        System.out.println("cac so le:");
        for (Integer x : mang) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}

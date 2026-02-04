package LEC6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2_Hienthi7soThuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> mang = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap so thuc thu " + (i + 1) + ": ");
            mang.add(sc.nextDouble());
        }
        System.out.println("Danh sach so thuc:");
        for (Double x : mang) {
            System.out.println(x);
        }
    }
}

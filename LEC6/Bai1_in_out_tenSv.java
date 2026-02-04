package LEC6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_in_out_tenSv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ten = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap ten SV thu " + (i + 1) + ": ");
            ten.add(sc.nextLine());
        }
        System.out.println("Danh sach SV:");
        for (String name : ten) {
            System.out.println(name);
        }
    }
}

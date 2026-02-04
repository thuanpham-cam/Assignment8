package LEC6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai4_NhapMang_VietHam {

    // Hàm nhập mảng
    static void nhapMang(ArrayList<Integer> mang, Scanner sc) {
        System.out.print("Nhap so phan tu trong mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            mang.add(sc.nextInt());
        }
    }

    // Hàm in toàn bộ mảng
    static void inMang(ArrayList<Integer> mang) {
        System.out.println("A. Tat ca gia tri:");
        System.out.println(mang);
    }

    // Hàm in số chẵn và index
    static void inSoChan(ArrayList<Integer> mang) {
        int dem = 0;
        System.out.println("B. Cac gia tri chan va index:");

        for (int i = 0; i < mang.size(); i++) {
            if (mang.get(i) % 2 == 0) {
                System.out.println("Gia tri = " + mang.get(i) + " tai index = " + i);
                dem++;
            }
        }

        System.out.println("Co " + dem + " so chan");
    }

    // Hàm tính tổng mảng
    static int tinhTong(ArrayList<Integer> mang) {
        int tong = 0;
        for (int x : mang) {
            tong += x;
        }
        return tong;
    }

    // Hàm xóa phần tử theo giá trị
    static void xoaGiaTri(ArrayList<Integer> mang, Scanner sc) {
        System.out.print("Nhap gia tri can xoa: ");
        int xoa = sc.nextInt();
        mang.remove(Integer.valueOf(xoa));
        System.out.println("D. Danh sach sau khi xoa: " + mang);
    }

    // ================== MAIN ==================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();

        nhapMang(mang, sc);
        inMang(mang);
        inSoChan(mang);

        int tong = tinhTong(mang);
        System.out.println("C. Tong = " + tong);

        xoaGiaTri(mang, sc);
    }
}

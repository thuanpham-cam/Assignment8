/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_ConditionalExecution;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class while_nhan {
   public static void main(String[] args) {
       Scanner n = new Scanner(System.in);
       int tong = 0;
       int so = 1;
       while (so  != 0) {
           System.out.print("nhap mot so (ket thuc nhap 0): ");
           so = n.nextInt();
           tong += so ;
       }
       System.out.println("Tong cac so trong day da nhap la: " + tong);
   }
    
}

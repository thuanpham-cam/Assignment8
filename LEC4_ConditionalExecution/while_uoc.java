/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC4_ConditionalExecution;

/**
 *
 * @author LENOVO
 */
public class while_uoc {

    public static void main(String[] args) {
        int n = 91;
        int uocmin = 2;
        while (n % uocmin != 0) {
            uocmin++;
        }
        System.out.println("uoc nho nhat la: " + uocmin);
    }
}

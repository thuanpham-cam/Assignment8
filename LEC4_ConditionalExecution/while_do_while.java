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
public class while_do_while {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String chu;
            do {
                System.out.print("Type your password: ") ;
                chu = sc.next();
            } while (!chu.equals("duytan"));
}
}
    
    


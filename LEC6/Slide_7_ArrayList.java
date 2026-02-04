/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC6;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author LENOVO
 */
public class Slide_7_ArrayList {
    public static void main(String[] args) {
 ArrayList<String> names = new ArrayList<>();
 names.add("Huy1");
 names.add("Huy2");
 names.add("Huy3");
 System.out.println("n[]=" + Arrays.toString(names.toArray()));
 System.out.println("name[0]=" + names.get(0));
 System.out.println(names.remove("Huy2"));
 System.out.println(names.remove(1));
 System.out.println("n[]=" + Arrays.toString(names.toArray()));
 }
}

    


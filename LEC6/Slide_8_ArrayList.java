
package LEC6;
import java.util.ArrayList;
public class Slide_8_ArrayList {
    public static void main(String[] args) {    
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");      
        for(int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i)); 
        }
        for (String color: colors) {
            System.out.println(color);
    }
}   
}

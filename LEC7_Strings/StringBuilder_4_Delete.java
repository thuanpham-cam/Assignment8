package LEC7_Strings;

public class StringBuilder_4_Delete {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }
}

package LEC7_Strings;

public class StringBuffer_5_Reverse {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);

        System.out.println(sb);
    }
}

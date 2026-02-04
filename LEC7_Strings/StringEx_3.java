package LEC7_Strings;

public class StringEx_3 {

    public static void main(String args[]) {
        String s1 = "Kakaka";
        String s2 = "KaKaka";
        String s3 = new String("Kakaka");
        String s4 = "Hahaha";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}

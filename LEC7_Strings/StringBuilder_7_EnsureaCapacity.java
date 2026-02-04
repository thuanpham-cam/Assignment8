package LEC7_Strings;

public class StringBuilder_7_EnsureaCapacity {

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.capacity());

        sb.append("java is my favourite language");
        System.out.println(sb.capacity());

        sb.ensureCapacity(10);
        System.out.println(sb.capacity());

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}

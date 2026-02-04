package LEC_11.Encapsulation;

public class ProductTest {

    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(500);
        p.setPrice(1500);

        System.out.println("Price: " + p.getPrice());
    }
}

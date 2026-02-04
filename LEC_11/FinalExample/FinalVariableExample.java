package LEC_11.FinalExample;

public class FinalVariableExample {

    final int MAX_SCORE = 100;

    void show() {
        // MAX_SCORE = 200; // compile error
        System.out.println(MAX_SCORE);
    }
}

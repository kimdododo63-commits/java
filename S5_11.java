package jump2java;

public class S5_11 {
    void varTest(int a) {
        a++;
    }

    public static void main(String[] args) {
        int a = 1;
        S5_11 sample = new S5_11();
        sample.varTest(a);
        System.out.println(a);
    }
}

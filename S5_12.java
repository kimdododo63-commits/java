package jump2java;

public class S5_12 {
    int varTest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        S5_12 sample = new S5_12();
        a = sample.varTest(a);
        System.out.println(a);
    }
}

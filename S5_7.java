package jump2java;

public class S5_7 {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        S5_7 sample = new S5_7();
        int c = sample.sum(a, b);

        System.out.println(c);
    }
}

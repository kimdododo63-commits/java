package jump2java;

public class S5_13 {

    int a;  // 객체변수 a

    void varTest(S5_13 sample) {
        sample.a++;
    }

    public static void main(String[] args) {
        S5_13 sample = new S5_13();
        sample.a = 1;
        sample.varTest(sample);
        System.out.println(sample.a);
    }
}

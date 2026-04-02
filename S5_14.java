package jump2java;

public class S5_14 {

    int a;  // 객체변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args) {
        S5_14 sample = new S5_14();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}

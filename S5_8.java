package jump2java;

public class S5_8 {
    void sum(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }

    public static void main(String[] args) {
        S5_8 sample = new S5_8();
        sample.sum(3, 4);
    }
}
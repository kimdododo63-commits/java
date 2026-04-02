package jump2java;

public class S5_9 {
    String say() {
        return "Hi";
    }

    public static void main(String[] args) {
        S5_9 sample = new S5_9();
        String a = sample.say();
        System.out.println(a);  // "Hi" 출력
    }
}

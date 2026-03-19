package jump2java;

public class sample0307_8 {
    public static void main(String[] args) {
        String[] pitches = new String[]{"138", "129", "142"};
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
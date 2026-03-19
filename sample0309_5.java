package jump2java;

import java.util.HashSet;

public class sample0309_5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
    }
}
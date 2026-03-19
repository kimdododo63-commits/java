package jump2java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class sample0307_9 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches);  // [129, 138, 142] 출력
    }
}
package jump2java;

import java.util.ArrayList;

public class sample0307_4 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.indexOf("129"));  // 129의 인덱스인 1을 반환
    }
}

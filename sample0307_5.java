package jump2java;

import java.util.ArrayList;

public class sample0307_5 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제하고, true를 반환한다.
    }
}

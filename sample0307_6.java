package jump2java;

import java.util.ArrayList;

public class sample0307_6 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 반환한다.
    }
}

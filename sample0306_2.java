package jump2java;

public class sample0306_2 {
   public static void main(String[] args) {
	   StringBuffer sb = new StringBuffer();
	   String[] weeks = new String[7];
	   weeks[0] = "월";
	   weeks[1] = "화";
	   weeks[2] = "수";
	   weeks[3] = "목";
	   weeks[4] = "금";
	   weeks[5] = "토";
	   weeks[6] = "일";
	   String[] weeks1 = {"월", "화", "수", "목", "금", "토", "일"};
	   for (int i = 0; i < weeks1.length; i++) {
	       System.out.println(weeks1[i]);
	   }
}
}
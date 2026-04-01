package jump2java;

class Calculator4 {
    int result = 0; 
  
    int add(int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}

public class S5_4 {
    public static void main(String[] args) {
        Calculator4 cal = new Calculator4(); 
        
        System.out.println(cal.add(3)); 
        System.out.println(cal.sub(4)); 
    }
}

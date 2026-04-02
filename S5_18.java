package jump2java;

class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog2 extends Animal4 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog2 {
}

public class S5_18 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz 출력
    }
}

package jump2java;

class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal5 {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog1 extends Dog3 {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
}

public class S5_19 {
    public static void main(String[] args) {
        HouseDog1 houseDog = new HouseDog1();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz in house 출력
    }
}

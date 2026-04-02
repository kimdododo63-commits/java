package jump2java;

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal3 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

public class S5_17 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}

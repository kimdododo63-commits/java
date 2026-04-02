package jump2java;

class Animal1 {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class S5_6 {
    public static void main(String[] args) {
        Animal1 cat = new Animal1();
        cat.setName("boby");  // 메서드 호출

        Animal1 dog = new Animal1();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}

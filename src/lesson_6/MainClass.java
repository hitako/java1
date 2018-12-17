package lesson_6;

public class MainClass {
    public static void main(String[] args) {

        Animal dog1 = new Dog(500, 10, 0.5);
        Animal cat1 = new Cat(200, 0, 3.0);

        dog1.run(450);
        dog1.run(550);

        cat1.run(250);
        cat1.run(150);

        Animal dog2 = new Dog(600, 15, 2.0);
        Animal cat2 = new Cat(300, 2, 5.0);

        dog2.run(550);
    }
}

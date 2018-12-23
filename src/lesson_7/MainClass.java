package lesson_7;

public class MainClass {

    public static void main(String[] args) {
        FoodPlate foodPlate = new FoodPlate(20);
        Cat[] cats = new Cat[]{
                new Cat(3),
                new Cat(5),
                new Cat(10),
                new Cat(7),
                new Cat(1)
        };

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(foodPlate);
            System.out.println("Кот № " + (i+1) + ": " + (cats[i].getSatiety() ? "сыт" : "голоден"));
        }
    }

}

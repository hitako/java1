package lesson_7;

public class Cat {
    private boolean satiety;
    private int appetite;

    public Cat(int appetite) {
        this.satiety = false;
        this.appetite = appetite;
    }

    public void eat(FoodPlate plate) {
        if(plate.getFoodValue() - appetite > 0) {
            this.satiety = true;
            plate.setFoodValue(plate.getFoodValue() - appetite);
        }
    }

    public int getAppetite() {
        return this.appetite;
    }

    public boolean getSatiety() {
        return this.satiety;
    }
}

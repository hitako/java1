package lesson_7;

public class FoodPlate {
    private int foodValue;

    public FoodPlate(int foodValue) {
        this.foodValue = foodValue;
    }

    public int getFoodValue() {
        return this.foodValue;
    }

    public void setFoodValue(int value) {
        this.foodValue = value;
    }

    public void addFood(int food) {
        this.foodValue += food;
    }
}

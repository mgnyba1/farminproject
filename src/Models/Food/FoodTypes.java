package Models.Food;

public enum FoodTypes {
    APPLE(0), MEAT(1), SANDWICH(2), FORAGE(3);

    public int getValue() {
        return value;
    }
    private final int value;
    private FoodTypes(int value) {
        this.value = value;
    }


}

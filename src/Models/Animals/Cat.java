package Models.Animals;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cat extends Animal {
    public Cat(String name, BigDecimal buyCost, BigDecimal sellCost, double weightIncreaseSpeed, int growthTimeToMaturity, int foodNeededPerWeek, ArrayList<Integer> acceptableFoodTypes, int chanceToMultiply, double weight, double maxWeight, Boolean isYoung, int birthWeek)
    {
        super(name, buyCost, sellCost, weightIncreaseSpeed, growthTimeToMaturity, foodNeededPerWeek, acceptableFoodTypes, chanceToMultiply, weight, maxWeight, isYoung, birthWeek);
    }
}

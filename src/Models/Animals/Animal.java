package Models.Animals;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Animal {
    public BigDecimal sellCost; //kwota sprzedaży
    public BigDecimal buyCost; //kwota zakupu

    public int growthTimeToMaturity; //czas, by osobnik był dorosły
    public int foodNeededPerWeek;
    public ArrayList<Integer> acceptableFoodTypes;
    public int chanceToMultiply; //szansę na rozmnożenie w %
    public double weightIncreaseSpeed; //tempo wzrostu wagi na tydzień
    public double weight;
    public double maxWeight;

    public Boolean isYoung;
    public int birthWeek; //Tydzień urodzenia zwierzęcia
    public String name = "";

    public Animal(String name, BigDecimal buyCost, BigDecimal sellCost, double weightIncreaseSpeed, int growthTimeToMaturity, int foodNeededPerWeek, ArrayList<Integer> acceptableFoodTypes, int chanceToMultiply, double weight, double maxWeight, Boolean isYoung, int birthWeek)
    {
        this.name = name;
        this.buyCost = buyCost;
        this.sellCost = sellCost;
        this.weightIncreaseSpeed = weightIncreaseSpeed;
        this.growthTimeToMaturity = growthTimeToMaturity;
        this.foodNeededPerWeek = foodNeededPerWeek;
        this.acceptableFoodTypes = acceptableFoodTypes;
        this.chanceToMultiply = chanceToMultiply;
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.isYoung = isYoung;
        this.birthWeek = birthWeek;
    }

    public String getName()
    {
        if(this.isYoung)
        {
            return "Mł. " + this.name;
        }
        else
        {
            return this.name;
        }
    }
}

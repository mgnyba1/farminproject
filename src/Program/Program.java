package Program;

import Models.Animals.Animal;
import Models.Animals.Cat;
import Models.Animals.Chicken;
import Models.Animals.Dog;
import Models.Buildings.Barn;
import Models.Buildings.Building;
import Models.Buildings.Hovel;
import Models.Farm;
import Models.Food.FoodTypes;
import Models.Plants.ArableLand;
import Models.Plants.Plant;
import Models.Plants.Seed;
import Models.Player;
import jdk.jshell.spi.ExecutionControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Program {

    public static ArrayList<Farm> startingFarms;
    public static ArrayList<ArableLand> startingArableLands;
    public static ArrayList<Seed> availableSeedsToBuy;
    public static ArrayList<Building> availableBuildingsToBuy;
    public static ArrayList<Animal> availableAnimalsToBuy;

    public static Player player;
    public static int weekCounter = 1;
    public static int currentYear = 2021;
    public static int currentWeek = 1;

    public static void run(String[] args) throws IOException, ExecutionControl.NotImplementedException {

        System.out.println(("Hello World!"));

        //Główna logika programu. To Be Added.
    }

}

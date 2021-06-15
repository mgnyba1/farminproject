package Models.Plants;

import Program.Program;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Seed {
    public BigDecimal costOfLandPrepareAndPlanting; //koszt przygotowania ziemi / 1ha
    public BigDecimal costOfPestProtection; //koszt ochrony przed szkodnikami / 1ha
    public BigDecimal cropY; //wydajność upraw w tonach
    public int lengthOfPlantingToHarvest; //długość okresu od posadzenia do zbiorów w tygodniach
    public ArrayList<Integer> weeksWithPossibilityToPlant; //informację o tym w których tygodniach roku można siać/sadzić
    public BigDecimal harvestCost; //koszt zbioru (w przeliczeniu na hektar)
    public BigDecimal purchasePricePerKilo; //cena skupu kilograma

    public BigDecimal seedCost; //Koszt nasion
    public int plantingWeek; //Tydzień zasadzenia nasion.
    public String seedName; //Nazwa nasiona
    public String plantName; //Nazwa rośliny

    public Seed(String seedName, String plantName, BigDecimal seedCost, BigDecimal costOfLandPrepareAndPlanting, BigDecimal costOfPestProtection, BigDecimal cropY, int lengthOfPlantingToHarvest, ArrayList<Integer> weeksWithPossibilityToPlant, BigDecimal harvestCost, BigDecimal purchasePricePerKilo)
    {
        this.seedName = seedName;
        this.plantName = plantName;
        this.seedCost = seedCost;
        this.costOfLandPrepareAndPlanting = costOfLandPrepareAndPlanting;
        this.costOfPestProtection = costOfPestProtection;
        this.cropY = cropY;
        this.lengthOfPlantingToHarvest = lengthOfPlantingToHarvest;
        this.weeksWithPossibilityToPlant = weeksWithPossibilityToPlant;
        this.harvestCost = harvestCost;
        this.purchasePricePerKilo = purchasePricePerKilo;
    }

    //Sprawdza, czy nasiono wykiełkowało
    public Boolean checkIfSeedGerminated()
    {
        if(Program.weekCounter-this.plantingWeek == this.lengthOfPlantingToHarvest) //Jeżeli nasiona wykiełkowały
        {
            return true;
        }

        return false;
    }
}

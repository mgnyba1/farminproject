package Models.Plants;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Plant {
    public BigDecimal costOfLandPrepareAndPlanting; //koszt przygotowania ziemi i sadzenia / 1 hektar
    public BigDecimal costOfProtection; //koszt ochrony / 1 hektar
    public BigDecimal cropY; //wydajność upraw w tonach z hektara (ile możesz zebrać gotowego towaru)
    public int lengthOfPlantingToHarvest; //długość okresu od posadzenia do zbiorów w tygodniach
    public ArrayList<Integer> weeksWithPossibilityToPlant; //informację o tym w których tygodniach roku można siać/sadzić
    public BigDecimal harvestCost; //koszt zbioru (w przeliczeniu na hektar)
    public BigDecimal purchasePrice; //cena sprzedazy rosliny

    public String name; //Nazwa rośliny

    public Plant(String name, BigDecimal costOfPestProtection, BigDecimal cropY, int lengthOfPlantingToHarvest, ArrayList<Integer> weeksWithPossibilityToPlant, BigDecimal harvestCost, BigDecimal purchasePrice)
    {
        this.name = name;
        this.costOfLandPrepareAndPlanting = costOfLandPrepareAndPlanting;
        this.costOfProtection = costOfPestProtection;
        this.cropY = cropY;
        this.lengthOfPlantingToHarvest = lengthOfPlantingToHarvest;
        this.weeksWithPossibilityToPlant = weeksWithPossibilityToPlant;
        this.harvestCost = harvestCost;
        this.purchasePrice = purchasePrice;

        //Normalizacja decimali:
        this.purchasePrice = this.purchasePrice.setScale(2, RoundingMode.HALF_EVEN);
        this.harvestCost = this.harvestCost.setScale(2, RoundingMode.HALF_EVEN);
        this.costOfLandPrepareAndPlanting = this.costOfLandPrepareAndPlanting.setScale(2, RoundingMode.HALF_EVEN);
        this.costOfProtection = this.costOfProtection.setScale(2, RoundingMode.HALF_EVEN);
    }
}

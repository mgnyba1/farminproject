package Models;

import Models.Plants.ArableLand;
import Models.Plants.Seed;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {
    public BigDecimal money;
    public ArrayList<Farm> farms;
    public ArrayList<ArableLand> arableLands;
    public ArrayList<Seed> seeds; //Nasiona gracza

    public int eggsCount;

    public Player()
    {
        farms = new ArrayList<Farm>();
        arableLands = new ArrayList<ArableLand>();
        seeds = new ArrayList<Seed>();
        eggsCount = 0;
    }
}

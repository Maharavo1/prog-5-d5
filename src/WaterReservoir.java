public class WaterReservoir {
    private int waterLevel;


    public WaterReservoir(int initialWater) {
        this.waterLevel = initialWater;
    }


    public boolean checkWater(int waterNeeded) {
        if (waterLevel < waterNeeded) {
            System.out.println("Erreur : Manque d'eau.");
            return false;
        }
        return true;
    }

    public void useWater(int waterUsed) {
        waterLevel -= waterUsed;
    }
}
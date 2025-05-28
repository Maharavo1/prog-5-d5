public class CoffeeSelection {
    private IngredientInventory inventory;
    private WaterReservoir waterReservoir;
    private PowerSupply powerSupply;


    public CoffeeSelection(IngredientInventory inventory, WaterReservoir waterReservoir, PowerSupply powerSupply) {
        this.inventory = inventory;
        this.waterReservoir = waterReservoir;
        this.powerSupply = powerSupply;
    }


    public boolean canPrepareCoffee(int coffeeNeeded, int milkNeeded, int sugarNeeded, int waterNeeded) {
        return inventory.checkIngredients(coffeeNeeded, milkNeeded, sugarNeeded) &&
                waterReservoir.checkWater(waterNeeded) &&
                powerSupply.checkPower();
    }
}
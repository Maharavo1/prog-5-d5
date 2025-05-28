public class CoffeeDispenser {
    private IngredientInventory inventory;
    private WaterReservoir waterReservoir;

    public CoffeeDispenser(IngredientInventory inventory, WaterReservoir waterReservoir) {
        this.inventory = inventory;
        this.waterReservoir = waterReservoir;
    }

    public void getCoffee(int coffeeNeeded, int milkNeeded, int sugarNeeded, int waterNeeded) {
        if (inventory.checkIngredients(coffeeNeeded, milkNeeded, sugarNeeded) &&
                waterReservoir.checkWater(waterNeeded)) {
            inventory.useIngredients(coffeeNeeded, milkNeeded, sugarNeeded);
            waterReservoir.useWater(waterNeeded);
            System.out.println("Café préparé et distribué avec succès !");
        }
    }
}
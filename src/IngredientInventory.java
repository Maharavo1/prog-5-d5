public class IngredientInventory {
    private int coffeeStock;
    private int milkStock;
    private int sugarStock;


    public IngredientInventory(int coffee, int milk, int sugar) {
        this.coffeeStock = coffee;
        this.milkStock = milk;
        this.sugarStock = sugar;
    }


    public boolean checkIngredients(int coffeeNeeded, int milkNeeded, int sugarNeeded) {
        if (coffeeStock < coffeeNeeded) {
            System.out.println("Erreur : Stock de café insuffisant.");
            return false;
        }
        if (milkStock < milkNeeded) {
            System.out.println("Erreur : Stock de lait insuffisant.");
            return false;
        }
        if (sugarStock < sugarNeeded) {
            System.out.println("Erreur : Stock de sucre insuffisant.");
            return false;
        }
        return true;
    }
;

    public void useIngredients(int coffeeUsed, int milkUsed, int sugarUsed) {
        coffeeStock -= coffeeUsed;
        milkStock -= milkUsed;
        sugarStock -= sugarUsed;
    }
}
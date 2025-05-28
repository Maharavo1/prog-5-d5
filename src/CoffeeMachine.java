public class CoffeeMachine {
    public static void main(String[] args) {
        IngredientInventory inventory = new IngredientInventory(10, 10, 10);
        WaterReservoir waterReservoir = new WaterReservoir(10);
        PowerSupply powerSupply = new PowerSupply(true);


        PaymentModule paymentModule = new PaymentModule();
        CoffeeSelection coffeeSelection = new CoffeeSelection(inventory, waterReservoir, powerSupply);
        CoffeeDispenser coffeeDispenser = new CoffeeDispenser(inventory, waterReservoir);
        UserInterface userInterface = new UserInterface(paymentModule, coffeeSelection, coffeeDispenser);


        userInterface.start();
    }
}
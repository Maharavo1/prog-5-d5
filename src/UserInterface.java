import java.util.Scanner;


public class UserInterface {
    private PaymentModule paymentModule;
    private CoffeeSelection coffeeSelection;
    private CoffeeDispenser coffeeDispenser;


    public UserInterface(PaymentModule paymentModule, CoffeeSelection coffeeSelection, CoffeeDispenser coffeeDispenser) {
        this.paymentModule = paymentModule;
        this.coffeeSelection = coffeeSelection;
        this.coffeeDispenser = coffeeDispenser;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sélectionnez votre café (1: Espresso, 2: Latte, 3: Cappuccino): ");
        int choice = scanner.nextInt();
        double coffeePrice = 0;
        int coffeeNeeded = 0, milkNeeded = 0, sugarNeeded = 0, waterNeeded = 0;


        switch (choice) {
            case 1:
                coffeePrice = 1.5;
                coffeeNeeded = 1;
                milkNeeded = 0;
                sugarNeeded = 0;
                waterNeeded = 1;
                break;
            case 2:
                coffeePrice = 2.0;
                coffeeNeeded = 1;
                milkNeeded = 1;
                sugarNeeded = 0;
                waterNeeded = 1;
                break;
            case 3:
                coffeePrice = 2.5;
                coffeeNeeded = 1;
                milkNeeded = 1;
                sugarNeeded = 1;
                waterNeeded = 1;
                break;
            default:
                System.out.println("Choix invalide.");
                return;
        }


        System.out.println("Entrez le montant à payer : ");
        double amountPaid = scanner.nextDouble();

        if (paymentModule.processPayment(amountPaid, coffeePrice)) {
            if (coffeeSelection.canPrepareCoffee(coffeeNeeded, milkNeeded, sugarNeeded, waterNeeded)) {
                coffeeDispenser.getCoffee(coffeeNeeded, milkNeeded, sugarNeeded, waterNeeded);
            }
        }
    }
}
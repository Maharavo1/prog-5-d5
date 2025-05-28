public class PaymentModule {
    public boolean processPayment(double amountPaid, double coffeePrice) {
        if (amountPaid < coffeePrice) {
            System.out.println("Erreur : Paiement insuffisant.");
            return false;
        }
        return true;
    }
}
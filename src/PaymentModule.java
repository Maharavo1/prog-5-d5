class PaymentModule {
    public boolean processPayment(double amountPaid, double coffeePrice) {
        if (amountPaid < coffeePrice) {
            System.out.println("Erreur : Paiement insuffisant. Veuillez compléter le paiement.");
            return false;
        }
        return true;
    }
}
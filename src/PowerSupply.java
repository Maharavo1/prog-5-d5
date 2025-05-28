public class PowerSupply {
    private boolean isPoweredOn;


    public PowerSupply(boolean isPoweredOn) {
        this.isPoweredOn = isPoweredOn;
    }


    public boolean checkPower() {
        if (!isPoweredOn) {
            System.out.println("Erreur : Machine hors tension.");
            return false;
        }
        return true;
    }
}
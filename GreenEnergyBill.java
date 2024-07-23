// This is the Subclass of EnergyBill to handle green energy contributions
class GreenEnergyBill extends EnergyBill {
    private double solarEnergyContribution; // Solar energy contribution in kWh

    // Constructor to initialize customer details, usage, and solar contribution
    public GreenEnergyBill(String customerName, String address, double electricityUsage, double gasUsage, double solarEnergyContribution) {
        super(customerName, address, electricityUsage, gasUsage);
        this.solarEnergyContribution = solarEnergyContribution;
    }

    // This Override method to calculate electricity charge with solar deduction
    @Override
    public double calculateElectricityCharge() {
        // Subtract solar energy contribution from electricity charge
        double netElectricityUsage = Math.max(0, super.calculateElectricityCharge() - (solarEnergyContribution * 0.15));
        return netElectricityUsage;
    }

    // To Override method to calculate total bill with solar deduction
    @Override
    public double calculateTotalBill() {
        return calculateElectricityCharge() + calculateGasCharge();
    }
}

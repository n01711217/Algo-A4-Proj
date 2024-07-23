

// This is the Base class for energy bill calculations
class EnergyBill {
    private String customerName;  // Customer's name
    private String address;       // Customer's address
    private double electricityUsage; // Electricity usage in kWh
    private double gasUsage;         // Gas usage in units

    // The Constants for rates (these could be read from a config file or database in a real-world application)
    private static final double ELECTRICITY_RATE = 0.15; // Rate in dollars per kWh
    private static final double GAS_RATE = 0.10;         // Rate in dollars per unit

    // The Constructor to initialize customer details and usage
    public EnergyBill(String customerName, String address, double electricityUsage, double gasUsage) {
        this.customerName = customerName;
        this.address = address;
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    // Method to calculate electricity charge
    public double calculateElectricityCharge() {
        return electricityUsage * ELECTRICITY_RATE;
    }

    // Method to calculate gas charge
    public double calculateGasCharge() {
        return gasUsage * GAS_RATE;
    }

    // Method to calculate total bill (electricity + gas)
    public double calculateTotalBill() {
        return calculateElectricityCharge() + calculateGasCharge();
    }

    // Getter for customer's name
    public String getCustomerName() {
        return customerName;
    }

    // Getter for customer's address
    public String getAddress() {
        return address;
    }
}

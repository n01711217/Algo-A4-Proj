import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The Default customer name
        String name = "Ernest Ovbiolokun";

        // This Prompt user for address
        System.out.println("Enter address:");
        String address = scanner.nextLine();

        // This Prompt user for electricity usage
        System.out.println("Enter electricity usage (kWh):");
        double electricityUsage = scanner.nextDouble();

        // This Prompt user for gas usage
        System.out.println("Enter gas usage (units):");
        double gasUsage = scanner.nextDouble();

        // Ask if the user is using solar energy
        System.out.println("Are you using solar energy? (yes/no):");
        String solarUsage = scanner.next();

        // If using solar energy, prompt for solar energy contribution
        if (solarUsage.equalsIgnoreCase("yes")) {
            System.out.println("Enter solar energy contribution (kWh):");
            double solarEnergyContribution = scanner.nextDouble();

            // Create an instance of GreenEnergyBill
            GreenEnergyBill greenBill = new GreenEnergyBill(name, address, electricityUsage, gasUsage, solarEnergyContribution);
            displayBill(greenBill);
        } else {
            // Create an instance of EnergyBill
            EnergyBill bill = new EnergyBill(name, address, electricityUsage, gasUsage);
            displayBill(bill);
        }

        scanner.close();
    }

    // Method to display the bill details
    private static void displayBill(EnergyBill bill) {
        System.out.println("\nCustomer: " + bill.getCustomerName());
        System.out.println("Address: " + bill.getAddress());
        System.out.println("Electricity Charge: $" + bill.calculateElectricityCharge());
        System.out.println("Gas Charge: $" + bill.calculateGasCharge());
        System.out.println("Total Bill: $" + bill.calculateTotalBill());
    }
}

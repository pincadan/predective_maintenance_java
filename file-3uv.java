import java.util.Scanner;
import java.util.Random;

public class PredictiveMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Assuming the production line has 100 machines
        int[] machineHealth = new int[100];

        // Initialize machine health randomly
        for (int i = 0; i < machineHealth.length; i++) {
            machineHealth[i] = random.nextInt(101);
        }

        System.out.println("Predictive Maintenance System");
        System.out.println("-----------------------------");

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Check machine health");
            System.out.println("2. Perform maintenance");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkMachineHealth(machineHealth);
                    break;
                case 2:
                    performMaintenance(machineHealth);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void checkMachineHealth(int[] machineHealth) {
        System.out.println("Machine Health Check");
        System.out.println("--------------------");

        for (int i = 0; i < machineHealth.length; i++) {
            System.out.println("Machine " + (i + 1) + ": " + machineHealth[i] + "%");
        }
    }

    private static void performMaintenance(int[] machineHealth) {
        System.out.println("Maintenance Scheduler");
        System.out.println("---------------------");

        System.out.println("Enter the machine number to perform maintenance:");
        int machineNumber = new Scanner(System.in).nextInt();

        if (machineNumber < 1 || machineNumber > machineHealth.length) {
            System.out.println("Invalid machine number. Please try again.");
            return;
        }

        int machineIndex = machineNumber - 1;
        machineHealth[machineIndex] = 100;
        System.out.println("Maintenance completed for Machine " + machineNumber);
    }
}
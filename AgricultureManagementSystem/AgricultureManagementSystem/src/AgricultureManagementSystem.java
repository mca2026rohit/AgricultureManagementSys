// AgricultureManagementSystem.java
import java.util.Scanner;

/**
 * Main application for the Agriculture Management System.
 * Demonstrates five types of inheritance using agriculture examples.
 * Provides a menu to select and execute inheritance demonstrations.
 *
 * @author Student
 * @version 1.0
 */
public class AgricultureManagementSystem {

    /**
     * Starts the program and processes user menu selections.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("\n==================================");
            System.out.println(" AGRICULTURE MANAGEMENT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Demonstrate All Inheritance Types");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SingleInheritance.run();
                    break;
                case 2:
                    MultipleInheritance.run();
                    break;
                case 3:
                    MultilevelInheritance.run();
                    break;
                case 4:
                    HierarchicalInheritance.run();
                    break;
                case 5:
                    HybridInheritance.run();
                    break;
                case 6:
                    SingleInheritance.run();
                    MultipleInheritance.run();
                    MultilevelInheritance.run();
                    HierarchicalInheritance.run();
                    HybridInheritance.run();
                    break;
                case 0:
                    System.out.println("Exiting Agriculture Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select from 0 to 6.");
            }
        } while (choice != 0);

        sc.close();
    }
}

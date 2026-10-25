// MultipleInheritance.java
/**
 * Defines the capability to perform agricultural machine operations.
 */
interface FarmMachineCapability {
    void performFarmOperation();
}

/**
 * Defines the capability to manage irrigation.
 */
interface IrrigationCapability {
    /**
 * Manages water supply for agricultural crops.
 */
void manageIrrigation();
}

/**
 * Represents a smart agricultural machine that supports
 * farming and irrigation operations through two interfaces.
 */
class SmartAgricultureMachine
        implements FarmMachineCapability, IrrigationCapability {

    @Override
    public void performFarmOperation() {
        System.out.println("Performing agricultural operations.");
        System.out.println("Machine: Smart Tractor");
    }

    @Override
    public void manageIrrigation() {
        System.out.println("Managing automatic irrigation.");
        System.out.println("Water supply adjusted for the crop.");
    }
}

/**
 * Demonstrates multiple inheritance using Java interfaces.
 */
public class MultipleInheritance {
    /**
 * Creates a smart agriculture machine and demonstrates
 * both farming and irrigation capabilities.
 */
public static void run() {
        System.out.println("\n--- MULTIPLE INHERITANCE ---");

        SmartAgricultureMachine machine = new SmartAgricultureMachine();
        machine.performFarmOperation();
        machine.manageIrrigation();
    }
}

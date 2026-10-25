// HybridInheritance.java
/**
 * Defines operations for monitoring soil moisture.
 */
interface IrrigationMonitoring {
    void monitorSoilMoisture();
}

/**
 * Represents technology used to improve agricultural efficiency.
 */
class AgriculturalTechnology {
    /**
 * Displays general agricultural technology information.
 */
void displayTechnology() {
        System.out.println("Technology: Smart Agriculture");
        System.out.println("Purpose: Improving Farm Efficiency");
    }
}

/**
 * Represents a smart irrigation system that inherits
 * agricultural technology and implements irrigation monitoring.
 */
class SmartIrrigation extends AgriculturalTechnology
        implements IrrigationMonitoring {

    @Override
    public void monitorSoilMoisture() {
        System.out.println("Monitoring soil moisture.");
        System.out.println("Soil moisture level: 35%");
    }

    /**
 * Controls the irrigation process according to moisture requirements.
 */
void controlWaterSupply() {
        System.out.println("Checking soil moisture requirements.");
        System.out.println("Activating irrigation when required.");
    }
}

/**
 * Demonstrates hybrid inheritance using a class and an interface.
 */
public class HybridInheritance {/**
 * Creates a smart irrigation system and demonstrates its operations.
 */
public static void run() {
        System.out.println("\n--- HYBRID INHERITANCE ---");

        SmartIrrigation system = new SmartIrrigation();
        system.displayTechnology();
        system.monitorSoilMoisture();
        system.controlWaterSupply();
    }
}

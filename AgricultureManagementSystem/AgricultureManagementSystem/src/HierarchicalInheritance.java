// HierarchicalInheritance.java
/**
 * Represents general equipment used in agriculture.
 */
class AgriculturalEquipment {
   /**
 * Displays the category and purpose of agricultural equipment.
 */
void displayEquipment() {
        System.out.println("Category: Agricultural Equipment");
        System.out.println("Purpose: Supporting Farm Operations");
    }
}

/**
 * Represents a tractor used for agricultural field operations.
 */
class Tractor extends AgriculturalEquipment {
    /**
 * Simulates the process of ploughing a field.
 */
void ploughField() {
        System.out.println("Tractor is ploughing the field.");
    }
}

/**
 * Represents a harvester used to collect mature crops.
 */
class Harvester extends AgriculturalEquipment {
    /**
 * Simulates harvesting a crop.
 */
void harvestCrop() {
        System.out.println("Harvester is harvesting the crop.");
    }
}

/**
 * Demonstrates hierarchical inheritance using farm equipment.
 */
public class HierarchicalInheritance {
   /**
 * Creates tractor and harvester objects and displays their operations.
 */
public static void run() {
        System.out.println("\n--- HIERARCHICAL INHERITANCE ---");

        System.out.println("\nTractor Details:");
        Tractor tractor = new Tractor();
        tractor.displayEquipment();
        tractor.ploughField();

        System.out.println("\nHarvester Details:");
        Harvester harvester = new Harvester();
        harvester.displayEquipment();
        harvester.harvestCrop();
    }
}

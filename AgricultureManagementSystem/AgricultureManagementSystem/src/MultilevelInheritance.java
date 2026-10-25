// MultilevelInheritance.java
/**
 * Represents general activities performed in agriculture.
 */
class AgriculturalActivity {
    /**
 * Displays general agricultural activity details.
 */
void displayActivity() {
        System.out.println("Activity: Agriculture");
        System.out.println("Purpose: Food Production");
    }
}

/**
 * Represents crop cultivation as an agricultural activity.
 * Inherits from AgriculturalActivity.
 */
class CropCultivation extends AgriculturalActivity {
    /**
 * Displays the basic crop cultivation process.
 */
void displayCultivation() {
        System.out.println("Activity: Crop Cultivation");
        System.out.println("Preparing soil and planting seeds.");
    }
}

/**
 * Represents organic farming as a specialized form
 * of crop cultivation.
 */
class OrganicFarming extends CropCultivation {
    /**
 * Displays organic farming methods and practices.
 */
void displayOrganicFarming() {
        System.out.println("Method: Organic Farming");
        System.out.println("Using natural manure and compost.");
        System.out.println("Reducing the use of synthetic chemicals.");
    }
}

/**
 * Demonstrates multilevel inheritance in agriculture.
 */
public class MultilevelInheritance {
    /**
 * Creates an organic farming object and displays
 * information inherited from all three levels.
 */
public static void run() {
        System.out.println("\n--- MULTILEVEL INHERITANCE ---");

        OrganicFarming farm = new OrganicFarming();
        farm.displayActivity();
        farm.displayCultivation();
        farm.displayOrganicFarming();
    }
}

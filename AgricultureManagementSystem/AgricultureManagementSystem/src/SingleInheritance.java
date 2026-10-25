// SingleInheritance.java
/**
 * Represents a crop in the Agriculture Management System.
 * Stores general information about a crop.
 */
class Crop {
    String cropName;
    int duration;

/**
 * Displays the name and growing duration of the crop.
 */
   void displayCropDetails() {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Crop Duration: " + duration + " days");
    }
}


/**
 * Represents rice as a specialized crop.
 * Inherits common properties and methods from Crop.
 */
class RiceCrop extends Crop {
    /**
 * Displays information specific to rice cultivation.
 */
    void displayRiceDetails() {
        System.out.println("Crop Type: Rice");
        System.out.println("Cultivation Method: Paddy Farming");
        System.out.println("Water Requirement: High");
    }
}

/**
 * Demonstrates single inheritance in the agriculture domain.
 */
public class SingleInheritance {
    /**
 * Creates a rice crop and displays its details.
 */
public static void run() {
        System.out.println("\n--- SINGLE INHERITANCE ---");

        RiceCrop rice = new RiceCrop();
        rice.cropName = "Rice";
        rice.duration = 120;

        rice.displayCropDetails();
        rice.displayRiceDetails();
    }
}

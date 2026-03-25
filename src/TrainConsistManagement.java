import java.util.ArrayList;
import java.util.List;

/**
 * ================================================================
 * MAIN CLASS – TrainConsistManagement (UC1)
 * ================================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * This use case introduces collection initialization and
 * basic program startup flow.
 *
 * @author Developer
 * @version 1.0
 */
public class TrainConsistManagement {

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println("Current state: Engine with " + bogies.size() + " bogies attached.");
    }
}

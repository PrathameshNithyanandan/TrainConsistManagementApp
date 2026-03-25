import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> bogies = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + bogies.size());
        System.out.println("Current state: Engine with " + bogies.size() + " bogies attached.");
    }
}

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static boolean validateTrainId(String trainId) {
        String trainIdRegex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(trainIdRegex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean validateCargoCode(String cargoCode) {
        String cargoCodeRegex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(cargoCodeRegex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC11: Validate Train ID & Cargo Codes ===");

        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        if (validateTrainId(trainId)) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Train ID is invalid.");
        }

        if (validateCargoCode(cargoCode)) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Cargo Code is invalid.");
        }

        scanner.close();
    }
}

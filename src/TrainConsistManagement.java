import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {

    static class GoodsBogie {
        private String type;
        private String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        public String getType() {
            return type;
        }

        public String getCargo() {
            return cargo;
        }
    }

    public static boolean isSafetyCompliant(List<GoodsBogie> goodsBogies) {
        return goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical")
                                || bogie.getCargo().equalsIgnoreCase("Petroleum"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        System.out.println("=== UC12: Safety Compliance Check for Goods Bogies ===");
        System.out.print("Enter number of goods bogies: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for bogie " + i + ":");
            System.out.print("Type: ");
            String type = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            goodsBogies.add(new GoodsBogie(type, cargo));
        }

        boolean safe = isSafetyCompliant(goodsBogies);

        if (safe) {
            System.out.println("Train is safety compliant.");
        } else {
            System.out.println("Train is NOT safety compliant.");
        }

        scanner.close();
    }
}

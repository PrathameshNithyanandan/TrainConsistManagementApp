import java.util.LinkedList;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: Maintain Ordered Bogie IDs");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry Car");

        train.removeFirst();
        train.removeLast();

        System.out.println("Final train consist:");
        System.out.println(train);
    }
}

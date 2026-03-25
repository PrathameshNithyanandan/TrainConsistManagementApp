import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }
}

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC9: Group Bogies by Type");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped bogies:");
        for (String type : groupedBogies.keySet()) {
            System.out.println(type + " -> " + groupedBogies.get(type));
        }
    }
}

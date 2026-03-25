import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
        System.out.println("UC7: Sort Bogies by Capacity");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}

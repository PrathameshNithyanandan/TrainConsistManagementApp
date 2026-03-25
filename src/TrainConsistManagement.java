import java.util.HashSet;
public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Track Unique Bogie IDs");
        HashSet<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); 
        bogieIds.add("BG104");
        bogieIds.add("BG102");
        System.out.println("Final bogie IDs in the train:");
        System.out.println(bogieIds);
        System.out.println("Total unique bogies: " + bogieIds.size());
    }
}

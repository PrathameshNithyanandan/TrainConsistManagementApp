import java.util.Arrays;

public class TrainConsistManagementApp {

    public static String[] sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames);
        return bogieNames;
    }

    public static void main(String[] args) {
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        sortBogieNames(bogieNames);

        System.out.println("After Sorting: " + Arrays.toString(bogieNames));
    }
}

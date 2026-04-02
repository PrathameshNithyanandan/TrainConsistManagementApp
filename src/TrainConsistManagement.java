public class TrainConsistManagementApp {

public class TrainConsistManagementApp {

    public static boolean binarySearchBogieId(String[] bogieIds, String searchKey) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        boolean found = binarySearchBogieId(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the sorted train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the sorted train consist.");
        }
    }
}

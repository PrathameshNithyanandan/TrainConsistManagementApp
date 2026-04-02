public class TrainConsistManagementApp {

    public static boolean searchBogieId(String[] bogieIds, String searchKey) {
        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchKey)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        boolean found = searchBogieId(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found in the train consist.");
        }
    }
}

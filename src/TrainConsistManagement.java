public class TrainConsistManagementApp {

    public static boolean searchBogieId(String[] bogieIds, String searchKey) {
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: train has no bogies.");
        }

        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchKey)) {
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
        String[] bogieIds = {};

        try {
            boolean found = searchBogieId(bogieIds, "BG101");
            System.out.println("Search Result: " + found);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

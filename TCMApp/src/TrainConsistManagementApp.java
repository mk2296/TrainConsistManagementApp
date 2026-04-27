public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {};
        String searchId = "BG309";

        if (bogieIds.length == 0) {
            throw new IllegalStateException("Search cannot proceed: no bogies available in train consist");
        }

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = searchId.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Searching for bogie ID: " + searchId);
        System.out.println("Bogie found: " + found);
    }
}
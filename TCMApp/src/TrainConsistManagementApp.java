public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchId = "BG309";

        boolean found = false;
        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchId)) {
                found = true;
                break;
            }
        }

        System.out.println("Searching for bogie ID: " + searchId);
        System.out.println("Bogie found: " + found);
    }
}
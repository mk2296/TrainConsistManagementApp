import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        Arrays.sort(bogieTypes);

        System.out.println("Sorted bogie type names:");
        System.out.println(Arrays.toString(bogieTypes));
    }
}
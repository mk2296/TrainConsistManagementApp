import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        boolean isTrainIdValid = trainIdMatcher.matches();
        boolean isCargoCodeValid = cargoCodeMatcher.matches();

        System.out.println("Train ID (" + trainId + ") valid: " + isTrainIdValid);
        System.out.println("Cargo Code (" + cargoCode + ") valid: " + isCargoCodeValid);
    }
}
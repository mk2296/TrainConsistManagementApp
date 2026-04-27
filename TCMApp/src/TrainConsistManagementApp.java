import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();
        System.out.println("Passenger bogie list initialized.");

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Sleeper", 70));
        passengerBogies.add(new Bogie("AC Chair", 58));

        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(bogie -> bogie.name));

        System.out.println("Bogies grouped by type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie bogie : entry.getValue()) {
                System.out.println("  capacity -> " + bogie.capacity);
            }
        }

        System.out.println("Original passenger bogie count: " + passengerBogies.size());
        System.out.println("Grouped category count: " + groupedBogies.size());
    }
}
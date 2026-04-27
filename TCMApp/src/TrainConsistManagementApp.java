import java.util.ArrayList;
import java.util.List;

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
        passengerBogies.add(new Bogie("Second Sitting", 70));

        int totalSeatingCapacity = passengerBogies.stream()
                .map(bogie -> bogie.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total seating capacity in train: " + totalSeatingCapacity);
        System.out.println("Original passenger bogie count: " + passengerBogies.size());
    }
}
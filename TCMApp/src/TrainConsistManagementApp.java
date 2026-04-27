import java.util.ArrayList;
import java.util.List;
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

        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            int capacity = 40 + (i % 50);
            bogies.add(new Bogie("Bogie-" + i, capacity));
        }

        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.capacity > 60) {
                loopFiltered.add(bogie);
            }
        }
        long loopEnd = System.nanoTime();

        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(bogie -> bogie.capacity > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();

        long loopDuration = loopEnd - loopStart;
        long streamDuration = streamEnd - streamStart;

        System.out.println("Loop filtering count: " + loopFiltered.size());
        System.out.println("Stream filtering count: " + streamFiltered.size());
        System.out.println("Loop execution time (ns): " + loopDuration);
        System.out.println("Stream execution time (ns): " + streamDuration);
        System.out.println("Results match: " + (loopFiltered.size() == streamFiltered.size()));
    }
}
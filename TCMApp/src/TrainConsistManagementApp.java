public class TrainConsistManagementApp {
    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            PassengerBogie acChair = new PassengerBogie("AC Chair", 56);

            System.out.println("Passenger bogies created successfully:");
            System.out.println(sleeper.name + " -> " + sleeper.capacity);
            System.out.println(acChair.name + " -> " + acChair.capacity);

            PassengerBogie invalid = new PassengerBogie("Faulty Bogie", 0);
            System.out.println(invalid.name + " -> " + invalid.capacity);
        } catch (InvalidCapacityException exception) {
            System.out.println("Failed to create passenger bogie: " + exception.getMessage());
        }
    }
}
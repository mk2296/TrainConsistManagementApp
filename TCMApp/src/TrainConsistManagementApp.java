public class TrainConsistManagementApp {
    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            if ("Rectangular".equals(shape) && "Petroleum".equals(cargo)) {
                throw new CargoSafetyException("Petroleum cannot be assigned to Rectangular bogie");
            }
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        try {
            cylindrical.assignCargo("Petroleum");
            System.out.println("Assigned " + cylindrical.cargo + " to " + cylindrical.shape + " bogie.");

            rectangular.assignCargo("Petroleum");
            System.out.println("Assigned " + rectangular.cargo + " to " + rectangular.shape + " bogie.");
        } catch (CargoSafetyException exception) {
            System.out.println("Cargo assignment failed: " + exception.getMessage());
        } finally {
            System.out.println("Cargo assignment validation completed.");
        }

        rectangular.assignCargo("Coal");
        System.out.println("Assigned " + rectangular.cargo + " to " + rectangular.shape + " bogie.");
        System.out.println("Program continues safely.");
    }
}
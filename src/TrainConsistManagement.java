public class TrainConsistManagementApp {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static void main(String[] args) {
        try {
            PassengerBogie bogie1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Passenger bogie created successfully.");
            System.out.println("Type: " + bogie1.getType());
            System.out.println("Capacity: " + bogie1.getCapacity());

            PassengerBogie bogie2 = new PassengerBogie("AC Chair", -10);
            System.out.println("Type: " + bogie2.getType());
            System.out.println("Capacity: " + bogie2.getCapacity());
        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
            this.cargo = null;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        public boolean assignCargo(String cargo) {
            boolean assigned = false;

            try {
                if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be assigned to a Rectangular bogie");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);
                assigned = true;

            } catch (CargoSafetyException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment attempt completed.");
            }

            return assigned;
        }
    }

    public static void main(String[] args) {
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");

        bogie1.assignCargo("Petroleum");
        bogie2.assignCargo("Petroleum");

        System.out.println("Program continues safely.");
    }
}

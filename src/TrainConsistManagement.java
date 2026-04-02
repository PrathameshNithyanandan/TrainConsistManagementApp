import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    public static List<Bogie> filterBogiesUsingLoop(List<Bogie> bogies) {
        List<Bogie> filteredBogies = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                filteredBogies.add(bogie);
            }
        }
        return filteredBogies;
    }

    public static List<Bogie> filterBogiesUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static long measureLoopExecutionTime(List<Bogie> bogies) {
        long startTime = System.nanoTime();
        filterBogiesUsingLoop(bogies);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        return elapsedTime > 0 ? elapsedTime : 1;
    }

    public static long measureStreamExecutionTime(List<Bogie> bogies) {
        long startTime = System.nanoTime();
        filterBogiesUsingStream(bogies);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        return elapsedTime > 0 ? elapsedTime : 1;
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 64));
        bogies.add(new Bogie("General", 58));
        bogies.add(new Bogie("Luxury", 80));

        long loopTime = measureLoopExecutionTime(bogies);
        long streamTime = measureStreamExecutionTime(bogies);

        List<Bogie> loopResult = filterBogiesUsingLoop(bogies);
        List<Bogie> streamResult = filterBogiesUsingStream(bogies);

        System.out.println("=== UC13: Performance Comparison (Loops vs Streams) ===");

        System.out.println("\nLoop-based filtered bogies:");
        for (Bogie bogie : loopResult) {
            System.out.println(bogie.getName() + " - " + bogie.getCapacity());
        }

        System.out.println("Loop Execution Time: " + loopTime + " ns");

        System.out.println("\nStream-based filtered bogies:");
        for (Bogie bogie : streamResult) {
            System.out.println(bogie.getName() + " - " + bogie.getCapacity());
        }

        System.out.println("Stream Execution Time: " + streamTime + " ns");
    }
}

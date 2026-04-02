import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testLoopFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 64));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogiesUsingLoop(bogies);

        assertEquals(2, result.size());
        for (TrainConsistManagementApp.Bogie bogie : result) {
            assertTrue(bogie.getCapacity() > 60);
        }
    }

    @Test
    void testStreamFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 64));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterBogiesUsingStream(bogies);

        assertEquals(2, result.size());
        for (TrainConsistManagementApp.Bogie bogie : result) {
            assertTrue(bogie.getCapacity() > 60);
        }
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 64));
        bogies.add(new TrainConsistManagementApp.Bogie("General", 58));

        List<TrainConsistManagementApp.Bogie> loopResult =
                TrainConsistManagementApp.filterBogiesUsingLoop(bogies);

        List<TrainConsistManagementApp.Bogie> streamResult =
                TrainConsistManagementApp.filterBogiesUsingStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 64));

        long loopTime = TrainConsistManagementApp.measureLoopExecutionTime(bogies);
        long streamTime = TrainConsistManagementApp.measureStreamExecutionTime(bogies);

        assertTrue(loopTime >= 0);
        assertTrue(streamTime >= 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            bogies.add(new TrainConsistManagementApp.Bogie("Bogie" + i, i % 100));
        }

        List<TrainConsistManagementApp.Bogie> loopResult =
                TrainConsistManagementApp.filterBogiesUsingLoop(bogies);

        List<TrainConsistManagementApp.Bogie> streamResult =
                TrainConsistManagementApp.filterBogiesUsingStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }
}

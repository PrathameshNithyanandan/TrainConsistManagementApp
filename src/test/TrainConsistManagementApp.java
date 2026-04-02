import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Open", "Coal"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Box", "Grain"));

        assertTrue(TrainConsistManagementApp.isSafetyCompliant(bogies));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistManagementApp.isSafetyCompliant(bogies));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Open", "Coal"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Box", "Grain"));

        assertTrue(TrainConsistManagementApp.isSafetyCompliant(bogies));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Box", "Cement"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        assertFalse(TrainConsistManagementApp.isSafetyCompliant(bogies));
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        assertTrue(TrainConsistManagementApp.isSafetyCompliant(bogies));
    }
}

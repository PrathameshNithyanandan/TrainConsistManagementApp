import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testBinarySearch_BogieFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG309"));
    }

    @Test
    void testBinarySearch_BogieNotFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG999"));
    }

    @Test
    void testBinarySearch_FirstElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101"));
    }

    @Test
    void testBinarySearch_LastElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG550"));
    }

    @Test
    void testBinarySearch_SingleElementArray() {
        String[] bogieIds = {"BG101"};
        assertTrue(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101"));
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] bogieIds = {};
        assertFalse(TrainConsistManagementApp.binarySearchBogieId(bogieIds, "BG101"));
    }
}

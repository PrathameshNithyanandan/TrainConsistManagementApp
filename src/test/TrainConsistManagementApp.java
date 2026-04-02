import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testEmptySearch_ThrowsIllegalStateException() {
        String[] bogieIds = {};

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.searchBogieId(bogieIds, "BG101");
        });

        assertEquals("Cannot perform search: train has no bogies.", exception.getMessage());
    }

    @Test
    void testNullSearch_ThrowsIllegalStateException() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            TrainConsistManagementApp.searchBogieId(null, "BG101");
        });

        assertEquals("Cannot perform search: train has no bogies.", exception.getMessage());
    }

    @Test
    void testSearch_BogieFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG205"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        assertFalse(TrainConsistManagementApp.searchBogieId(bogieIds, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG101"));
    }
}

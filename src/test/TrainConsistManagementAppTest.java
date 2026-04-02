import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    @Test
    void testSearch_BogieFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertFalse(TrainConsistManagementApp.searchBogieId(bogieIds, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] bogieIds = {"BG101"};
        assertTrue(TrainConsistManagementApp.searchBogieId(bogieIds, "BG101"));
    }
}

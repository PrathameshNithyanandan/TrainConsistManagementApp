import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicAlphabeticalSorting() {
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        String[] expected = {"AC Chair", "First Class", "General", "Luxury", "Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(bogieNames);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSort_UnsortedInput() {
        String[] bogieNames = {"Luxury", "General", "Sleeper", "AC Chair"};
        String[] expected = {"AC Chair", "General", "Luxury", "Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(bogieNames);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSort_AlreadySortedArray() {
        String[] bogieNames = {"AC Chair", "First Class", "General"};
        String[] expected = {"AC Chair", "First Class", "General"};

        String[] result = TrainConsistManagementApp.sortBogieNames(bogieNames);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSort_DuplicateBogieNames() {
        String[] bogieNames = {"Sleeper", "AC Chair", "Sleeper", "General"};
        String[] expected = {"AC Chair", "General", "Sleeper", "Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(bogieNames);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSort_SingleElementArray() {
        String[] bogieNames = {"Sleeper"};
        String[] expected = {"Sleeper"};

        String[] result = TrainConsistManagementApp.sortBogieNames(bogieNames);

        assertArrayEquals(expected, result);
    }
}

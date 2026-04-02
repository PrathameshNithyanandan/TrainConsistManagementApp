import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        boolean result = bogie.assignCargo("Petroleum");

        assertTrue(result);
        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        boolean result = bogie.assignCargo("Petroleum");

        assertFalse(result);
        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        TrainConsistManagementApp.GoodsBogie bogie =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        TrainConsistManagementApp.GoodsBogie bogie1 =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");
        TrainConsistManagementApp.GoodsBogie bogie2 =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        boolean firstResult = bogie1.assignCargo("Petroleum");
        boolean secondResult = bogie2.assignCargo("Coal");

        assertFalse(firstResult);
        assertTrue(secondResult);
        assertEquals("Coal", bogie2.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            TrainConsistManagementApp.GoodsBogie bogie =
                    new TrainConsistManagementApp.GoodsBogie("Rectangular");

            bogie.assignCargo("Petroleum");

            String output = outputStream.toString();
            assertTrue(output.contains("Cargo assignment attempt completed."));
        } finally {
            System.setOut(originalOut);
        }
    }
}

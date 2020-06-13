import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    @Test
    void everyStatementTest() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2(null));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2(null));
        assertTrue(ex.getMessage().contains("User already exists!"));
    }
}
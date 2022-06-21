import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PourTesterExoTest {

    @Test
    @DisplayName("Should add array's numbers")
    void additionnerTableau() {
        assertEquals(12,PourTesterExo.AdditionnerTableau(new int[]{2,5,1,4}));
    }
}
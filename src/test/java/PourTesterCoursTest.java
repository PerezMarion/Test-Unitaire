import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PourTesterCoursTest {

    @Test
    @DisplayName("Should add two numbers")
    void additionner() {
        assertEquals(4, PourTesterCours.additionner(2,2));
        assertEquals(-1, PourTesterCours.additionner(8,-9));
    }
    @Test
    @DisplayName("Should multiply two numbers")
    void multiplier(){
        assertEquals(16, PourTesterCours.multiplier(4,4));
        assertEquals(12, PourTesterCours.multiplier(3,4));
        assertEquals(-6, PourTesterCours.multiplier(2,-3));
    }
    @Test
    @DisplayName("Should substract two numbers")
    void soustraire(){
        assertEquals(3, PourTesterCours.soustraire(7,4));
        assertEquals(-3, PourTesterCours.soustraire(-6,-3));
    }
    @Test
    @DisplayName("Should concatenate two strings")
    void concatener(){
        assertEquals("papa",PourTesterCours.concatener("pa","pa"));
    }
}
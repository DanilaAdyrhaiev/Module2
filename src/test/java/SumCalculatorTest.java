import org.exemple.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    void setCalc() {
        calc = new SumCalculator();
    }

    @Test
    public void testSumWithNumberOne(){
        int actual = calc.sum(1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithNumberTree(){
        int actual = calc.sum(3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void testSumWithNumberZeroThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}

import org.example.Main;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testDivide() {
        assertEquals(4.0, Main.divide(20, 5));
        assertEquals(0.5, Main.divide(1, 2));
        assertEquals(-1.0, Main.divide(-5, 5));
        assertEquals(-10.0, Main.divide(50, -5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Main.divide(10, 0);
    }
}
package test_arithmetics;

import arithmetics.Arithmetics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticsTest {
    @Test
    public void testAdd() {
        Arithmetics a = new Arithmetics();
        double response = a.addValues(8,3 );
        Assertions.assertEquals(11, response);
    }
    @Test
    public void testMult() {
        Arithmetics a = new Arithmetics();
        double response = a.multiplyValues(5, 9);
        Assertions.assertEquals(45, response);
    }
    @Test
    public void testDeduct() {
        Arithmetics a = new Arithmetics();
        double response = a.divideValues(21, 7);
        Assertions.assertEquals(3, response);
    }
    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        double response = a.subtractionValues(10, 5);
        Assertions.assertEquals(5, response);
    }
}

package br.com.study.math;

import br.com.study.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleMathTest {

    @Test
    void testSum(){
        SimpleMath math = new SimpleMath();
        Double actual = math.sum(6.2D, 2D);
        double expected = 8.2D;

        assertEquals(expected, actual, "6.2+2 did not produce 8.2!");
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    @Test
    void testSubtraction(){
        SimpleMath math = new SimpleMath();
        Double actual = math.subtraction(5D, 3D);
        double expected = 2;

        assertEquals(expected, actual, "5-3 did not produce 2.1");

    }

    @Test
    void testMultiplication(){
        SimpleMath math = new SimpleMath();
        Double actual = math.multiplication(2D, 3.1D);
        double expected = 6.2D;

        assertEquals(expected, actual, "2*3.1 did not produce 6");

    }

    @Test
    void testDivision(){
        SimpleMath math = new SimpleMath();
        Double actual = math.division(10D,5D);
        double expected = 2D;

        assertEquals(expected, actual, "10/5 did not produce 3");
    }

    @Test
    void testMean(){
        SimpleMath math = new SimpleMath();
        Double mean = math.mean(4.2D, 6.8D);
        double expected = 5.5D;

        assertEquals(expected, mean, "(4.2+6.8)/2 did not produce 5.3");
    }

    @Test
    void testSquareRoot(){
        SimpleMath math = new SimpleMath();
        Double squareRoot = math.squareRoot(36D);
        double expected = 6D;

        assertEquals(expected, squareRoot, "Valor calculado não bate com o resultado esperado");
    }

}

package vattenfall.sumofsquares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vattenfall.sumofsquares.exception.InvalidRangeException;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumOfSquareTest {

    @Test
    void testCalculateSumOfSquaresOfZero() {
        int sumOfSquares = SumOfSquares.calculateSumOfSquaresInRange(0, 0);

        assertEquals(0, sumOfSquares);
    }

    @Test
    void testCalculateSumOfSquaresOfOne() {
        int sumOfSquares = SumOfSquares.calculateSumOfSquaresInRange(0, 1);

        assertEquals(1, sumOfSquares);
    }

    @Test
    void testCalculateSumOfSquares() {
        int sumOfSquares = SumOfSquares.calculateSumOfSquaresInRange(1, 5); // 1*1 + 2*2 + 3*3 + 4*4 + 5*5 = 55

        assertEquals(55, sumOfSquares);
    }

    @Test
    void testCalculateSumOfSquaresOnNegative() {
        int sumOfSquares = SumOfSquares.calculateSumOfSquaresInRange(-4, -2); // -4*(-4) + -3*(-3) + -2*(-2) = 29

        assertEquals(29, sumOfSquares);
    }

    @Test
    void testWithInvalidRange() {
        Assertions.assertThrows(InvalidRangeException.class, () -> SumOfSquares.calculateSumOfSquaresInRange(4, 1));
    }

}

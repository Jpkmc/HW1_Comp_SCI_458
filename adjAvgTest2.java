package Problem_2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class adjAvgTest2 {

    private final adjAvg2 calc = new adjAvg2();

    @Test
    public void testPreventOverflowWithLargeIntegers() {
        // Without long, this would overflow (MAX + MAX + MAX)
        java.util.List<Integer> numbers = Arrays.asList(
                Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

        // min = max = MAX, remove one occurrence → left with [MAX, MAX]
        double expected = (double) Integer.MAX_VALUE;

        assertEquals(expected, calc.adjustedAverage(numbers), 0.0001);
    }

    @Test
    public void testPreventOverflowMixedLargeValues() {
        java.util.List<Integer> numbers = Arrays.asList(
                Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 0);

        // min = MIN, max = MAX, remove one of each
        // Remaining: [MAX, MIN, 0]
        long sum = (long) Integer.MAX_VALUE + (long) Integer.MIN_VALUE + 0;
        int count = numbers.size() - 2; // removed one min and one max
        double expected = (double) sum / count;

        assertEquals(expected, calc.adjustedAverage(numbers), 0.0001);
    }
}


package Problem_2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class adjAvgTest1 {
     @Test
    public void testSimpleCase() {
        assertEquals(3.0, adjAvg1.adjustedAverage(Arrays.asList(1, 2, 3, 4, 5)), 0.0001);
    }

    @Test
    public void testLargerNumbers() {
        assertEquals(30.0, adjAvg1.adjustedAverage(Arrays.asList(10, 20, 30, 40, 50)), 0.0001);
    }

    @Test
    public void testAllSameValues() {
        assertEquals(5.0, adjAvg1.adjustedAverage(Arrays.asList(5, 5, 5, 5, 5, 5)), 0.0001);
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-1.0, adjAvg1.adjustedAverage(Arrays.asList(-5, -2, -1, 0, 5)), 0.0001);
    }

    //Unit test was incorrect and 2.5 was actaully 5 
    @Test
    public void testMixedPositiveNegative() {
        assertEquals(5, adjAvg1.adjustedAverage(Arrays.asList(-10, 0, 5, 10, 20)), 0.0001);
    }

    @Test
    public void testWithDuplicates() {
        assertEquals(4.0, adjAvg1.adjustedAverage(Arrays.asList(1, 1, 4, 4, 7, 7)), 0.0001);
    }

    @Test
    public void testThreeElements() {
        assertEquals(2.0, adjAvg1.adjustedAverage(Arrays.asList(1, 2, 3)), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsExceptionForTwoElements() {
        adjAvg1.adjustedAverage(Arrays.asList(1, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowsExceptionForEmptyList() {
        adjAvg1.adjustedAverage(new ArrayList<>());
    }

    @Test
    public void testLargeList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 100; i++) nums.add(i);
        double expected = (5050 - 1 - 100) / 98.0; // average of 2..99
        assertEquals(expected, adjAvg1.adjustedAverage(nums), 0.0001);
    }
}

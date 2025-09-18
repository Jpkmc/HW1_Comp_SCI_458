package Problem_2;
import java.util.*;

public class adjAvg2 {
    /**
     * Calculates the adjusted average of a list of integers,
     * excluding one occurrence of the maximum and minimum values.
     *
     * @param nums list of integers
     * @return adjusted average as double
     * @throws IllegalArgumentException if list has 2 or fewer elements
     */
    public double adjustedAverage(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 3) {
            throw new IllegalArgumentException("List must contain at least 3 numbers");
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // Use long to prevent overflow
        long sum = 0;
        for (int n : numbers) {
            sum += (long) n;
        }

        // Remove one occurrence of min and max
        sum -= min;
        sum -= max;

        int count = numbers.size() - 2;

        return (double) sum / count;
    }
}


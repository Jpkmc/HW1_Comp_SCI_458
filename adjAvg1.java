package Problem_2;
import java.util.*;

public class adjAvg1 {
    /**
     * Calculates the adjusted average of a list of integers,
     * excluding one occurrence of the maximum and minimum values.
     *
     * @param nums list of integers
     * @return adjusted average as double
     * @throws IllegalArgumentException if list has 2 or fewer elements
     */
    public static double adjustedAverage(List<Integer> nums) {
        if (nums == null || nums.size() <= 2) {
            throw new IllegalArgumentException("List must contain more than two elements");
        }

        int min = Collections.min(nums);
        int max = Collections.max(nums);

        double sum = 0;
        int count = nums.size();

        boolean minRemoved = false;
        boolean maxRemoved = false;

        for (int n : nums) {
            if (n == min && !minRemoved) {
                minRemoved = true; // skip one min
                continue;
            }
            if (n == max && !maxRemoved) {
                maxRemoved = true; // skip one max
                continue;
            }
            sum += n;
        }

        return sum / (count - 2); // since 2 elements are excluded
    }
}

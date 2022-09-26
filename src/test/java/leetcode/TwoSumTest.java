package leetcode;

import org.junit.Test;

import static helpers.Matchers.arrayWithSize;
import static helpers.Matchers.hasItemInArray;
import static org.hamcrest.MatcherAssert.assertThat;

public class TwoSumTest {

    @Test
    public void shouldReturnExpectedIndexes() {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2, 7, 11, 15};
        int[] indexes = twoSum.twoSum(nums, 9);

        assertThat(indexes, hasItemInArray(1));
        assertThat(indexes, hasItemInArray(1));
        assertThat(indexes, arrayWithSize(2));

        nums = new int[]{3, 2, 4};
        indexes = twoSum.twoSum(nums, 6);

        assertThat(indexes, hasItemInArray(1));
        assertThat(indexes, hasItemInArray(2));
        assertThat(indexes, arrayWithSize(2));

        nums = new int[]{3, 2, 3};
        indexes = twoSum.twoSum(nums, 6);

        assertThat(indexes, hasItemInArray(0));
        assertThat(indexes, hasItemInArray(2));
        assertThat(indexes, arrayWithSize(2));


        nums = new int[]{3, 3};
        indexes = twoSum.twoSum(nums, 6);

        assertThat(indexes, hasItemInArray(0));
        assertThat(indexes, hasItemInArray(1));
        assertThat(indexes, arrayWithSize(2));
    }

    @Test
    public void shouldReturnExpectedIndexesForSomeNegativeValues() {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2, -3, 6, 1};
        int[] indexes = twoSum.twoSum(nums, 3);

        assertThat(indexes, arrayWithSize(2));
        assertThat(indexes, hasItemInArray(0));
        assertThat(indexes, hasItemInArray(3));
    }

    @Test
    public void shouldReturnExpectedIndexesForAllNegativeValues() {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{-2, -3, -56, -14};
        int[] indexes = twoSum.twoSum(nums, -70);

        assertThat(indexes, arrayWithSize(2));
        assertThat(indexes, hasItemInArray(2));
        assertThat(indexes, hasItemInArray(3));
    }
}

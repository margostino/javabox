package helpers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import java.util.Arrays;

public class Matchers {

    public static Matcher<int[]> hasItemInArray(int item) {
        return new TypeSafeMatcher<int[]>() {
            @Override
            protected boolean matchesSafely(int[] nums) {
                return Arrays.stream(nums).anyMatch(value -> value == item);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("has item").appendValue(item);
            }
        };
    }

    public static Matcher<int[]> arrayWithSize(int size) {
        return new TypeSafeMatcher<int[]>() {
            @Override
            protected boolean matchesSafely(int[] nums) {
                return nums.length == size;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("with size").appendValue(size);
            }
        };
    }

}
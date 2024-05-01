package org.tsebom.let_code.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    void init() {
        twoSum = new TwoSum();
    }

    @ParameterizedTest
    @MethodSource
    public void twoSumTest(int[] result, int[] nums, int target) {
        Assertions.assertArrayEquals(result, twoSum.twoSum(nums, target));
    }

    static Stream<Arguments> twoSumTest() {
        return Stream.of(
                Arguments.arguments(new int[]{0,1}, new int[]{2,7,11,15}, 9),
                Arguments.arguments(new int[]{0,1}, new int[]{2,7,11,15}, 9),
                Arguments.arguments(new int[]{1,2}, new int[]{3,2,4}, 6),
                Arguments.arguments(new int[]{0,1}, new int[]{3,3}, 6),
                Arguments.arguments(new int[]{0,3}, new int[]{0,4,3,0}, 0),
                Arguments.arguments(new int[]{2,4}, new int[]{-1,-2,-3,-4,-5}, -8)
        );
    }
}

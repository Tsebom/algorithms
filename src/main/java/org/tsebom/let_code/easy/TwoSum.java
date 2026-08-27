package org.tsebom.let_code.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (map.get(search) != null) {
                result[0] = i;
                result [1] = map.get(search);
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}

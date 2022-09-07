package arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    /**
     * @param Input: nums = [1,2,3,1]
     * @return Output: true
     */
    //Native O(n^2) and space O(1)
    public static boolean containDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Better approach O(n) and space O(n)
    public static boolean containDuplicateB(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containDuplicateB(nums);
        System.out.println(result);
    }
}

package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    //Native
    public static int[] twoSumN(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> prevMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){

        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }

}

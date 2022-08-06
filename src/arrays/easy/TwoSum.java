package arrays.easy;

import java.util.HashMap;

public class TwoSum {

    //Native O(n^2)
    public static int[] twoSumNative(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }

    /**
     * @param nums
     * @param target
     * @return Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * O(n)
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {//check if the key is available
                return new int[]{hashMap.get(target - nums[i]), i};//then return the key
            }
            hashMap.put(nums[i], i);//add key into hash Map
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] array = TwoSum.twoSumNative(nums, 9);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

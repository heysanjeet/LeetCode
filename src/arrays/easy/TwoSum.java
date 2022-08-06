package arrays.easy;

import java.util.HashMap;

public class TwoSum {
    /**
     * @param nums
     * @param target
     * @return Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
       int[] array= TwoSum.twoSum(nums, 9);
       for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }

    }
}

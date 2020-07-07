/**
 * 1. 两数之和
 *
 * @author akun
 * @date 2020/7/5
 */
public class TwoSum {

    //暴力解法
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


}

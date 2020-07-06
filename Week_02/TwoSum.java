import java.util.Arrays;

/**
 * 1. 两数之和
 *
 * @author akun
 * @date 2020/7/5
 */
public class TwoSum {



    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    //暴力解法
    public static int[] twoSum(int[] nums, int target) {
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

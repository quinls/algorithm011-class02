import java.util.Arrays;

/**
 * 189. 旋转数组
 *
 * @author akun
 * @date 2020/6/29
 */
public class Rotate {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{-1};
        System.out.println(Arrays.toString(nums));
        int k = 2;
        int[] rotate = rotate2(nums, k);
        System.out.println(Arrays.toString(rotate));
    }

    //方法一：新数组
    public static int[] rotate1(int[] nums, int k) {
        int newIndex;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            newIndex = i + k > nums.length - 1 ? i + k - nums.length : i + k;
            newNums[i] = nums[newIndex];
        }
        return newNums;
    }

    //方法二：新数组
    public static int[] rotate2(int[] nums, int k) {
        int newIndex;
        k = k % nums.length;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            newIndex = i - k < 0 ? i + nums.length - k : i - k;
            newNums[i] = nums[newIndex];
        }
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = newNums[i];
        }
        return nums;
    }

}

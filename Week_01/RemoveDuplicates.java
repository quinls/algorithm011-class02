/**
 * 26. 删除排序数组中的重复项
 *
 * @author akun
 * @date 2020/6/29
 */
class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int temp = nums[0];
        int length = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (temp != nums[i]) {
                temp = nums[i];
                nums[length] = temp;
                length++;
            }
        }
        return length;
    }
}

import java.util.Arrays;


public class Test_02 {


    public static void main(String[] args) {
        isAnagram();
//        twoSum();
    }


    public static void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        boolean result = new IsAnagram().isAnagram(s, t);
        System.out.println(result);
    }

    public static void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = new TwoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}

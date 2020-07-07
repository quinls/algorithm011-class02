import java.util.Arrays;

public class Test_01 {


    public static void main(String[] args) {
        rotate();
//        removeDuplicates();

    }


    public static void rotate() {
        int[] nums = new int[]{-1};
        System.out.println(Arrays.toString(nums));
        int k = 2;
        int[] rotate = new Rotate().rotate2(nums, k);
        System.out.println(Arrays.toString(rotate));
    }

    public static void removeDuplicates() {
        int[] nums = new int[]{-1};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int i = removeDuplicates.removeDuplicates(nums);
    }
}

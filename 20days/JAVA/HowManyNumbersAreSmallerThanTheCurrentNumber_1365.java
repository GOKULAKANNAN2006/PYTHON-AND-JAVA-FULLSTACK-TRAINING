import java.util.Arrays;

public class LeetCode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1365 solution = new LeetCode1365();
        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}

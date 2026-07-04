import java.util.Arrays;

public class LeetCode628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }

    public static void main(String[] args) {
        LeetCode628 solution = new LeetCode628();
        System.out.println(solution.maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println(solution.maximumProduct(new int[]{1, 2, 3, 4, 5}));
    }
}

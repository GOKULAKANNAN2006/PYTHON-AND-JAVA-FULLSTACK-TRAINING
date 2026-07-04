public class LeetCode1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1480 solution = new LeetCode1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

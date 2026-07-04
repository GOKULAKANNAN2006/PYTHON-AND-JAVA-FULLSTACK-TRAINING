public class LeetCode1920 {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1920 solution = new LeetCode1920();
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] result = solution.buildArray(nums);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

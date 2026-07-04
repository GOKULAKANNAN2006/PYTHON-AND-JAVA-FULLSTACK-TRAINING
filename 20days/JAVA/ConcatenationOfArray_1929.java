public class LeetCode1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1929 solution = new LeetCode1929();
        int[] nums = {1, 2, 1};
        int[] result = solution.getConcatenation(nums);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

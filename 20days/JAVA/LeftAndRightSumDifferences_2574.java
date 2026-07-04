public class LeetCode2574 {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int running = 0;
        for (int i = 0; i < n; i++) {
            leftSum[i] = running;
            running += nums[i];
        }

        running = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum[i] = running;
            running += nums[i];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode2574 solution = new LeetCode2574();
        int[] nums = {10, 4, 8, 3};
        int[] result = solution.leftRightDifference(nums);
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

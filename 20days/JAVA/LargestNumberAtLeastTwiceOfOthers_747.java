public class LeetCode747 {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? maxIndex : -1;
    }

    public static void main(String[] args) {
        LeetCode747 solution = new LeetCode747();
        System.out.println(solution.dominantIndex(new int[]{3, 6, 1, 0}));
        System.out.println(solution.dominantIndex(new int[]{1, 2, 3, 4}));
    }
}

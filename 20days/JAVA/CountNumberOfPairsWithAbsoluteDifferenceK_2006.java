public class LeetCode2006 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode2006 solution = new LeetCode2006();
        int[] nums = {1, 2, 2, 1};
        System.out.println(solution.countKDifference(nums, 1));
    }
}

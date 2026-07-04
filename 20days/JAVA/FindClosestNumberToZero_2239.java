public class LeetCode2239 {
    public int closestToZero(int[] nums) {
        int closest = nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) ||
                (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        LeetCode2239 solution = new LeetCode2239();
        int[] nums = {-4, -2, 1, 4, 8};
        System.out.println(solution.closestToZero(nums));
    }
}

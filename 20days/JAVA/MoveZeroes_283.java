public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int insertIndex = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex++] = num;
            }
        }
        while (insertIndex < nums.length) {
            nums[insertIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        LeetCode283 solution = new LeetCode283();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

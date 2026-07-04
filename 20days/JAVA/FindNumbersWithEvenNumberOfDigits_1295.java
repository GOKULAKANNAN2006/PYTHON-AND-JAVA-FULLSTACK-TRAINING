public class LeetCode1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            int value = num;
            while (value > 0) {
                digits++;
                value /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1295 solution = new LeetCode1295();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(solution.findNumbers(nums));
    }
}

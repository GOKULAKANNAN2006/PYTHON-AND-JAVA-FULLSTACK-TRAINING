public class LeetCode3184 {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode3184 solution = new LeetCode3184();
        System.out.println(solution.countCompleteDayPairs(new int[]{12, 12, 30, 24, 24}));
        System.out.println(solution.countCompleteDayPairs(new int[]{72, 48, 24, 3}));
    }
}

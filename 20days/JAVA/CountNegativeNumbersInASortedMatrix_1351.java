public class LeetCode1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int value : row) {
                if (value < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LeetCode1351 solution = new LeetCode1351();
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {0, 0, -1, -1}};
        System.out.println(solution.countNegatives(grid));
    }
}
